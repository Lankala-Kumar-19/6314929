import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor() {
    super();
    this.state = {
      count: 5
    };
  }

  // Increment method that calls two functions
  increment = () => {
    this.setState(prevState => ({ count: prevState.count + 1 }), () => {
      this.sayHello();
    });
  };

  decrement = () => {
    this.setState(prevState => ({ count: prevState.count - 1 }));
  };

  sayHello = () => {
    alert("Hello Member1");
  };

  sayWelcome = (message) => {
    alert(message);
  };

  handleClick = (event) => {
    alert("I was clicked");
  };

  render() {
    return (
      <div style={{ padding: '20px', fontFamily: 'Arial' }}>
        <div>{this.state.count}</div>
        <button onClick={this.increment}>Increment</button>
        <br /><br />
        <button onClick={this.decrement}>Decrement</button>
        <br /><br />
        <button onClick={() => this.sayWelcome("welcome")}>Say welcome</button>
        <br /><br />
        <button onClick={this.handleClick}>Click on me</button>

        <hr />

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
