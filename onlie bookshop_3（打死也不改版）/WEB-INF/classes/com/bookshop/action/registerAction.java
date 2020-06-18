package com.bookshop.action;
import com.bookshop.dao.UserDao;
import com.bookshop.dao.Impl.UserDaoImpl;
import com.bookshop.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class registerAction extends ActionSupport implements ModelDriven<User>{
	
	private static final long serialVersionUID = 1L;
	private User user;
	UserDao userDAO = new UserDaoImpl();
	@Override
	public User getModel() {
		user=new User();
		return user;
	}	
	public String register() {
		if(userDAO.get(user.getUsername())==null){
			userDAO.AddUser(user);
			return SUCCESS;
		}else{
			addActionError(getText("User_full"));
			return INPUT;
		}

	}
	
	public String login(){
		User t_user=userDAO.get(user.getUsername());
		if(t_user!=null){
			if(t_user.getPassword().equals(user.getPassword())){
			return SUCCESS;}
			else{
				addActionError(getText("Account_error"));
				return INPUT;}
		}else{
			addActionError(getText("User_empty"));
			return INPUT;
		}
	}
}
