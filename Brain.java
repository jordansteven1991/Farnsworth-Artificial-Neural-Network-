import java.util.*;
import java.io.*;

/**
 * @Steven Jordan @02/01/2013
 * 
 * cleanup started 11/26/2022
 */
public class Brain {
	// instance variables - replace the example below with your own
	private int numOfNeurons = 18;
	private int numOfInputs = 8;
	private List<Input> inputs = new ArrayList<Input>();
	private List<Neuron> neurons = new ArrayList<Neuron>();
	private Database database;

	private MyStack results = new MyStack();

	public Brain() throws IOException {

		// database = new Database();
		
		for(int i = 0; i < numOfInputs; i++) {
			inputs.add(new Input());
		}
		
		for (int i = 0; i < numOfNeurons; i++) {
			neurons.add(new Neuron());
		}
		

	}

	public Brain(File file) throws IOException {


		database = new Database(file);
		for (int i = 0; i < numOfNeurons; i++) {
			neurons.add(new Neuron());
		}
		try {
			for (Neuron temp : neurons) {
				double x = database.getWeight();
				temp.setWeight(x);
			}
		} catch (Exception e) {
			System.err.println("Caught Exception: " + e.getMessage());

		}

	}

	

	public void activateNeurons() {
		Input result = new Input();
		for (Input input : inputs) {
			if (input.getInput() < 1) {
				double r = neurons.get(0).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 30 && input.getInput() >= 1) {
				double r = neurons.get(1).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 35 && input.getInput() >= 30) {
				double r = neurons.get(2).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 40 && input.getInput() >= 35) {
				double r = neurons.get(3).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 45 && input.getInput() >= 40) {
				double r = neurons.get(4).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 55 && input.getInput() >= 50) {
				double r = neurons.get(5).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 65 && input.getInput() >= 60) {
				double r = neurons.get(6).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 70 && input.getInput() >= 65) {
				double r = neurons.get(7).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 75 && input.getInput() >= 70) {
				double r = neurons.get(8).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 80 && input.getInput() >= 75) {
				double r = neurons.get(9).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 85 && input.getInput() >= 80) {
				double r = neurons.get(10).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 90 && input.getInput() >= 85) {
				double r = neurons.get(11).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 100 && input.getInput() >= 90) {
				double r = neurons.get(12).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 110 && input.getInput() >= 100) {
				double r = neurons.get(13).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 130 && input.getInput() >= 110) {
				double r = neurons.get(14).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 1000 && input.getInput() >= 130) {
				double r = neurons.get(15).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() < 2000 && input.getInput() >= 1000) {
				double r = neurons.get(16).fire(input.getInput());
				result.setInput(r);
			}

			if (input.getInput() > 2000) {
				double r = neurons.get(17).fire(input.getInput());
				result.setInput(r);
			}

			results.push(result.getInput());
		}

	}

	public void feedBrain(Input input1, Input input2, Input input3, Input input4, Input input5, Input input6,
			Input input7, Input input8) {
		inputs.clear();
		while (results.empty() == false) {
			results.pop();
		}
		
		inputs.add(input1);
		inputs.add(input2);
		inputs.add(input3);
		inputs.add(input4);
		inputs.add(input5);
		inputs.add(input6);
		inputs.add(input7);
		inputs.add(input8);
		activateNeurons();
	}

	public void feedBrain(Input input1, Input input2) {
		inputs.clear();
		while (results.empty() == false) {
			results.pop();
		}

		inputs.add(input1);
		inputs.add(input2);

		activateNeurons();
	}

	public void feedBrain(Input input1, Input input2, Input input3) {
		inputs.clear();
		while (results.empty() == false) {
			results.pop();
		}
		

		inputs.add(input1);
		inputs.add(input2);
		inputs.add(input3);
		activateNeurons();
	}

	public void feedBrain(Input input1, Input input2, Input input3, Input input4) {
		inputs.clear();
		while (results.empty() == false) {
			results.pop();
		}

		inputs.add(input1);
		inputs.add(input2);
		inputs.add(input3);
		inputs.add(input3);
		activateNeurons();
	}

	public MyStack getResults() {
		MyStack temp = new MyStack();
		while (results.empty() == false) {
			temp.push(results.pop());
		}

		return temp;
	}

	public void neuronShuffle() {

		Random tempRand = new Random();
		int binary = tempRand.nextInt(2);
		for (Neuron temp : neurons) {

			if (temp.getState() == 1) {
				if (binary == 1) {
					temp.increaseWeight();
				}

				else {
					temp.reduceWeight();
				}
			}
		}

	}

	public List<Neuron> getNeurons() {
		List<Neuron> usedNeurons = new ArrayList<Neuron>();

		for (Neuron temp : neurons) {

			if (temp.getState() == 1) {
				usedNeurons.add(temp);
			}
		}

		return usedNeurons;
	}

	public void saveWeights() throws IOException {
		for (Neuron temp : neurons) {
			database.saveWeight(temp.getWeight());
		}
	}

}
