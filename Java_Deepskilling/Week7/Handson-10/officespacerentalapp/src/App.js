import React from 'react';
import officeImage from './a.jpeg'; 

const officeSpaces = [
  {
    id: 1,
    name: "DBS",
    rent: 50000,
    address: "Chennai",
    image: officeImage, 
  },
  {
    id: 2,
    name: "Regus",
    rent: 70000,
    address: "Bangalore",
    image: officeImage, 
  },
];

function App() {
  const headingStyle = {
    fontWeight: "bold",
    fontSize: "30px",
    marginBottom: "20px",
  };

  const rentStyle = (rent) => ({
    color: rent > 60000 ? "green" : "red",
    fontWeight: "bold",
  });

  return (
    <div style={{ padding: "30px", fontFamily: "Arial" }}>
     
      <div style={headingStyle}>Office Space , at Affordable Range</div>

      {officeSpaces.map((office) => (
        <div key={office.id} style={{ marginBottom: "40px" }}>
          <img
            src={office.image}
            alt="Office"
            style={{ width: "300px", height: "200px", display: "block" }}
          />

          <h2 style={{ marginTop: "20px" }}>Name: {office.name}</h2>

          <p style={rentStyle(office.rent)}>Rent: Rs. {office.rent}</p>
          <p><strong>Address:</strong> {office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
