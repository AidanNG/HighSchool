//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.*;
import static java.lang.System.*;

public class HistoList {
	private HistoNode front;

	public HistoList() {
		front = null;
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void addLetter(char let) {
		HistoNode list = front;
		while (list != null) {
			if (list.getLetter() == let) {
				list.setLetterCount(list.getLetterCount() + 1);
				return;
			}
			list = list.getNext();
		}
		front = new HistoNode(let, 1, front);

	}

	//returns the index pos of let in the list if let exists
	public int indexOf(char let) {
		HistoNode list = front;
		for (int i = 0; list != null; i++) {
			if (list.getLetter() == let) {
				return i;
			}
			list = list.getNext();
		}
		return -1;
	}

	//returns a reference to the node at spot
	private HistoNode nodeAt(int spot) {
		HistoNode list = front;
		for (int i = 0; list != null; i++) {
			if (i == spot) {
				return list;
			}
			list = list.getNext();
		}
		return null;
	}

	//returns a string will all values from list
	public String toString() {
		String output = "";
		HistoNode list = front;
		while (list != null) {
			output += list.getLetter() + " - " + list.getLetterCount() + "     ";
			list = list.getNext();
		}

		return output.substring(0, output.length() - 5);
	}
}