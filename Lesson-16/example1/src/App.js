import React from 'react';
import logo from './logo.svg';
import './App.css';
import * as firebase from "firebase";

const config = {
  apiKey: "AIzaSyBRg_VPt41F9SmRHcncK4RFOoHiROLqpNw",
  authDomain: "example1-f1ad0.firebaseapp.com",
  databaseURL: "https://example1-f1ad0.firebaseio.com",
  projectId: "example1-f1ad0",
  storageBucket: "example1-f1ad0.appspot.com",
  messagingSenderId: "398374459498"
};
firebase.initializeApp(config);

const database = firebase.database();

class App extends React.Component {
 constructor() {
   super();
   this.state = {
     text: "default text"
   }
   };

   componentDidMount() {
    const textRef = database.ref("text/");
    textRef.on("value", snapshot => {
      this.setState({
        text: snapshot.val()
      });
  })
}
  writeData = e => {
    e.preventDefault();
    const text = e.target.elements.inputText.value;
    database.ref("text/").set(text, function (error){
      error ? alert("error") : console.log("it works")
    })
  };

 render() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <h1>
          {this.state.text}
          </h1>
          <form onSubmit={this.writeData.bind(this)}>
            <input type="text" name="inputText"/>
            <input type="submit" name="submitButton"/>
          </form>
      </header>
    </div>
  );
 }
}

export default App;
