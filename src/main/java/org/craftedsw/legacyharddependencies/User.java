package org.craftedsw.legacyharddependencies;

import java.util.ArrayList;
import java.util.List;

public class User {

	private List<Trip> trips = new ArrayList<Trip>();
	private List<User> friends = new ArrayList<User>();
	
	public List<User> getFriends() {
		return friends;
	}
	
	public void addFriend(User user) {
		friends.add(user);
	}

	public boolean isFriendsWith(User user) {
		for (User friend : friends) {
			if (friend.equals(user)) {
				return true;
			}
		}
		return false;
	}
	
	public void addTrip(Trip trip) {
		trips.add(trip);
	}
	
	public List<Trip> trips() {
		return trips;
	}

}
