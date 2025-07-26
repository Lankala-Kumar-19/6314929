import logo from './logo.svg';
import './App.css';
import { CalculateScore } from './Components/CalculateScore';
function App() {
  return (
    <div>
      <CalculateScore Name={"Kumar"}
      School={"VVIT"}
      total={300}
      goal={3}
      />
    </div>
  );
}

export default App;
