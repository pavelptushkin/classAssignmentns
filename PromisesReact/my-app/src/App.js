import React, {Component} from 'react';
import UserForm from './components/UserForm';
import './App.css';
import axios from 'axios'

class App extends Component {
  getUser = (e) => {
    e.preventDefault();
    var user = e.target.elements.username.value
  //   fetch(`https://api.github.com/users/${user}`)
  // .then(function(response) {
  //   return response.json();
  // })
  // .then(function(myJson) {
  //   console.log(JSON.stringify(myJson));
  // });
  axios.get(`https://api.github.com/users/${user}`).then(response => console.log(response.data));
  }
  render(){
  return (
    <div className="App">
      <header className="App-header">
        <h1 className="App-title">HTTP Requests in React</h1>
      </header>
      <UserForm getUser={this.getUser}></UserForm>
    </div>
  );
}
}

export default App;
