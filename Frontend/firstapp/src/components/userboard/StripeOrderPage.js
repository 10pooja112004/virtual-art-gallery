// StripeOrderPage.js
import React from "react";
import { Elements } from "@stripe/react-stripe-js";
import { loadStripe } from "@stripe/stripe-js";
import OrderDetails from "./OrderDetails"; // adjust path if needed

const stripePromise = loadStripe("pk_test_51R8P9gFzFnMi6dk4zlORGe39xMDKAkXwK3yJ4ZaZNVzKd17aUvxVoq7FQ2FJcGV0tctsKrIm5AmYF3K9X7HkEWC700BHRQvA2o");

const StripeOrderPage = (props) => {
  return (
    <Elements stripe={stripePromise}>
      <OrderDetails {...props} />
    </Elements>
  );
};

export default StripeOrderPage;
