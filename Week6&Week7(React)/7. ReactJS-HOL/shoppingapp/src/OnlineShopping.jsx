import React from 'react';
import Cart from './Cart';

class OnlineShopping extends React.Component {
  constructor(props) {
    super(props);
    // items are kept in state so you can later update them (illustrates state vs props)
    this.state = {
      items: [
        { id: 1, itemName: 'T-Shirt', price: 499 },
        { id: 2, itemName: 'Jeans', price: 1299 },
        { id: 3, itemName: 'Sneakers', price: 2499 },
        { id: 4, itemName: 'Watch', price: 1999 },
        // this item intentionally leaves out price to demonstrate defaultProps in Cart
        { id: 5, itemName: 'Sunglasses' }
      ]
    };
  }

  render() {
    const wrapper = { fontFamily: 'Arial, Helvetica, sans-serif', maxWidth: 680, margin: '32px auto' };
    const header = { background: '#6c5ce7', color: 'white', padding: '12px 18px', borderRadius: 8 };

    return (
      <div style={wrapper}>
        <header style={header}>
          <h1 style={{ margin: 0 }}>shoppingapp — Online Shopping</h1>
        </header>

        <section style={{ marginTop: 18 }}>
          <p>Looping through items stored in <code>this.state.items</code> and passing them as <strong>props</strong> to the <code>&lt;Cart /&gt;</code> component:</p>

          {/* Map over items and create a Cart component for each one */}
          <div>
            {this.state.items.map(item => (
              <Cart
                key={item.id}
                itemName={item.itemName}
                price={item.price}
              />
            ))}
          </div>
        </section>
      </div>
    );
  }
}

export default OnlineShopping;
