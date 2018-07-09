package javaStudy.test2017.note;

public class NotebookTest {

	public static void main(String[] args) {
		int variable = 10;
		NotebookTest nt = new NotebookTest();
		Notebook notebook = new Notebook("Notebook", 150);
		
		nt.operator(notebook, variable);
		
		System.out.println(notebook + "," + variable);
	}

	public void operator(Notebook notebook, int variable) {
		notebook.price = 100;
		variable = 20;
	}
}

class Notebook {
	String notebookModel;
	int price;
	
	public Notebook(String notebookModel, int price) {
		this.notebookModel = notebookModel;
		this.price = price;
	}
	
	public String toString() {
		return notebookModel + price;
	}
}
