package org.craftedsw.legacyharddependencies;

import java.util.ArrayList;
import java.util.List;

public class TripService {

	public List<Trip> getFriendTrips(User loggedUser, User friend) throws UserNotLoggedInException {
		validate(loggedUser);
		return (friend.isFriendsWith(loggedUser)) 
						? findTripsForFriend(friend)
					    : new ArrayList<Trip>();
	}

	protected void validate(User loggedUser) throws UserNotLoggedInException {
		if (loggedUser == null) {
			throw new UserNotLoggedInException();
		}
	}

	protected List<Trip> findTripsForFriend(User user) {
		return TripDAO.findTripsByUser(user);
	}

}
