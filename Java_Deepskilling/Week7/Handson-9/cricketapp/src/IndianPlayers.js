
import React from 'react';

const IndianPlayers = () => {
  const oddTeam = ['Sachin1', 'Virat3', 'Yuvaraj5'];
  const evenTeam = ['Dhoni2', 'Rohit4', 'Raina6'];

  const T20Players = ['Mr. First Player', 'Mr. Second Player', 'Mr. Third Player'];
  const RanjiTrophyPlayers = ['Mr. Fourth Player', 'Mr. Fifth Player', 'Mr. Sixth Player'];

  const mergedPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        <li>First : {oddTeam[0]}</li>
        <li>Third : {oddTeam[1]}</li>
        <li>Fifth : {oddTeam[2]}</li>
      </ul>

      <hr />

      <h2>Even Players</h2>
      <ul>
        <li>Second : {evenTeam[0]}</li>
        <li>Fourth : {evenTeam[1]}</li>
        <li>Sixth : {evenTeam[2]}</li>
      </ul>

      <hr />

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
