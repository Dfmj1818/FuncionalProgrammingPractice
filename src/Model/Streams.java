package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public List<Integer>createNumbers(){
		List<Integer>numbers=new ArrayList<Integer>();
		numbers.add(18);
		numbers.add(25);
		numbers.add(30);
		numbers.add(50);
		numbers.add(13);

		return numbers;

	}

	public List<Integer>filterNumbers(List<Integer>numbers){
		List<Integer>filteredNumbers=numbers.stream()
				.filter(number->number<=18)
				.collect(Collectors.toList());

		return filteredNumbers;
	}

	public List<User>createUsers(){
		List<User>users=new ArrayList<User>();
		users.add(new User("Armando",56));
		users.add(new User("Daniel",19));
		users.add(new User("Amadeo",36));
		users.add(new User("Adrian",20));
		users.add(new User("Andres",20));
		users.add(new User("Zonia",55));	
		
		return users;
	}

	public void showFilteredNumbers(List<Integer>filteredNumbers){
		filteredNumbers.forEach(number->System.out.println(number));
	}

	public void showFilteredUsers(List<User>filteredUsers){
		filteredUsers.forEach(user->System.out.println(user.toString()));
	}

	public List<User>filterUsers(List<User>usersList){
		List<User>filteredUsers=usersList.stream()
				.filter(user->user.getName().contains("d")&&user.getAge()<=50)
				.collect(Collectors.toList());

		return filteredUsers;  		      
	}


}
