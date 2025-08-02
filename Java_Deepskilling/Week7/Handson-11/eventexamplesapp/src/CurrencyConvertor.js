import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor() {
    super();
    this.state = {
      amount: '',
      currency: ''
    };
  }

  handleChange = (event) => {
    const { name, value } = event.target;
    this.setState({ [name]: value });
  };

  handleSubmit = (event) => {
    event.preventDefault(); // Prevent form reload
    const { amount, currency } = this.state;
    const converted = parseFloat(amount) * 80;
    alert(`Converting to ${currency} Amount is ${converted}`);
  };

  render() {
    const titleStyle = {
      color: 'green',
      fontSize: '28px',
      fontWeight: 'bold'
    };

    return (
      <div>
        <p style={titleStyle}>Currency Convertor!!!</p>
        <form onSubmit={this.handleSubmit}>
          <label>Amount: </label>
          <input
            type="text"
            name="amount"
            value={this.state.amount}
            onChange={this.handleChange}
          />
          <br /><br />
          <label>Currency: </label>
          <textarea
            name="currency"
            value={this.state.currency}
            onChange={this.handleChange}
          />
          <br /><br />
          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;
