package com.trinity.app.ws.userservice;

import com.trinity.app.ws.ui.model.request.UserDetailsRequestModel;
import com.trinity.app.ws.ui.model.response.UserRest;

public interface UserService {

	UserRest createUser(UserDetailsRequestModel userDetails);
}
