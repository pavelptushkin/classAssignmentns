import React from 'react';
import { BrowserRouter, Route, Switch } from "react-router-dom";
import './App.css';
import Home from "./components/Home"
import About from "./components/About"
import Contact from "./components/Contact"
import Error from "./components/Error"
import Navigation from "./components/Navigation"

class App extends React.Component
{
  render() {
    return(
      <BrowserRouter>
      <Navigation />
      <Switch>
      <Route path="/" component={Home} exact/>
      <Route path="/Contact" component={Contact} />
      <Route path="/About" component={About} />
      <Route component={Error} exact/>
      </Switch>
      </BrowserRouter>
    )
  }
}



export default App;
