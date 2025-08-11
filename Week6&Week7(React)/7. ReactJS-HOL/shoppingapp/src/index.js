// src/index.js
import React from 'react';
import { createRoot } from 'react-dom/client'; // <-- new import
import OnlineShopping from './OnlineShopping';

const root = createRoot(document.getElementById('root')); // create a root
root.render(
  <React.StrictMode>
    <OnlineShopping />
  </React.StrictMode>
);
