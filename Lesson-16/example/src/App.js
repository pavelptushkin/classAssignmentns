import React from "react";
import logo from "./logo.svg";
import "./App.css";
import * as firebase from "firebase";

var config = {
  apiKey: "AIzaSyAPGRbxLYVhhO86pBowtxyUSZ3gdIm7-kw",
  authDomain: "example1-4b14f.firebaseapp.com",
  databaseURL: "https://example1-4b14f.firebaseio.com",
  projectId: "example1-4b14f",
  storageBucket: "example1-4b14f.appspot.com",
  messagingSenderId: "530268130045"
};
firebase.initializeApp(config);

 const database = firebase.database();

 class App extends React.Component {
  constructor() {
    super();

     this.state = {
      image: logo,
      speed: 2000
    };
  }
  componentDidMount() {
    const imageRef = database.ref("image/");
    const speedRef = database.ref("speed/");
    imageRef.on("value", snapshot => {
      snapshot.val() == null
        ? this.setState({ image: logo })
        : this.setState({ image: snapshot.val() });
    });
    speedRef.on("value", snapshot => {
      this.setState({
        speed: snapshot.val()
      });
    });
  }

   writeData = e => {
    e.preventDefault();
    const image = e.target.elements.imageForm.value;
    const speed = e.target.elements.speed.value;

     database.ref("image/").set(image)
    database.ref("speed/").set(speed)
  };

   resetImage = e => {
    e.preventDefault();
    database.ref("image/").set(null)
  };
  changeSpeed = e => {
    const speed = e.target.value;
    e.preventDefault();
    database.ref("speed/").set(speed)
  };

   render() {
    return (
          <div className="App">
            <header className="App-header">
              <img src={this.state.image} className="App-logo" alt="logo" style={{animation: `App-logo-spin infinite ${this.state.speed}ms linear`}} />
              <p>
                Put a New Image to Spin
              </p>
               <form
                         id="form"
                         onSubmit={this.writeData.bind(this)}
                       >
                         <input
                           type="text"
                           name="imageForm"
                         />
                         <br />
                         <button
                           type="submit"
                           form="form"
                         >
                           Change The Image
                         </button>
                         <button
                           form="form"
                           onClick={this.resetImage.bind(this)}
                         >
                           Reset Image
                         </button>
                         <br />
                         <br />
                         Set Speed:
                         <input
                           type="input"
                           min="0"
                           max="5000"
                           defaultValue="2000"
                           name="speed"
                           onChange={this.changeSpeed.bind(this)}
                         />
                       </form>
            </header>
          </div>
        );
  }
}

 export default App;
