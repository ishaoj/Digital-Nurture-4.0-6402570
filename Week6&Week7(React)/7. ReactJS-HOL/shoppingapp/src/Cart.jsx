import React from 'react';

class Cart extends React.Component {
  render() {
    const { itemName, price } = this.props;
    // inline styles for simplicity in this lab
    const box = {
      border: '1px solid #e0e0e0',
      padding: '12px 16px',
      borderRadius: '8px',
      marginBottom: '10px',
      background: '#fff',
      boxShadow: '0 1px 4px rgba(0,0,0,0.04)'
    };

    return (
      <div style={box}>
        <h3 style={{ margin: 0 }}>{itemName}</h3>
        <p style={{ margin: '6px 0 0' }}>Price: ₹{price}</p>
      </div>
    );
  }
}

// Default props: used when parent does NOT pass those props
Cart.defaultProps = {
  itemName: 'Unknown Item',
  price: 0
};

export default Cart;