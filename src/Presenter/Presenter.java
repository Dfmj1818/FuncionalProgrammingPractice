package Presenter;

import java.util.List;
import java.util.Scanner;

import Model.Streams;
import Model.User;
import View.View;

public class Presenter {
	private Streams streams;
	private View view;

	public Presenter() {
		streams=new Streams();
		view=new View();

	}

	public void runServices() {
		view.printMessage("Test De Streams Con Numeros menores a 18");
        List<Integer>numbers=streams.createNumbers();
        List<Integer>filteredNumbers=streams.filterNumbers(numbers);
        streams.showFilteredNumbers(filteredNumbers);
        view.printMessage("---------------------------------------------------------------\nTest De Streams Con Usuario que tengan nombre con d");
        List<User>users=streams.createUsers();
        List<User>filteredUsers=streams.filterUsers(users);
        streams.showFilteredUsers(filteredUsers);
	}

	public static void main(String[]args) {
		Presenter presenter=new Presenter();
		presenter.runServices();

	}


}
