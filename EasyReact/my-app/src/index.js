import React from 'react';
import ReactDOM from 'react-dom';
import Board from './components/Board'
import * as serviceWorker from './serviceWorker';

ReactDOM.render(<Board />, document.getElementById('root'));
// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();

// import React from 'react';
// import ReactDOM from 'react-dom';

// class HelloMessage extends React.Component {
//   render() {
//     return (
//     	<div>Hello World</div>
//     );
//   }
// }
// var mountPoint = document.querySelector('#root');

// ReactDOM.render(<HelloMessage/>, mountPoint);