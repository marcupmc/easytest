package marcgregoire.easytest.domain;

import java.util.ArrayList;

/**
 * Method to test
 * @author MG0EF56N
 *
 */
public class Method {
	
	private String _package;
	private String _class;
	private String _method;
	private ArrayList<Type> _arguments;
	
	public Method(){
		
	}
	
	
	
	public String get_package() {
		return _package;
	}
	public void set_package(String _package) {
		this._package = _package;
	}
	public String get_class() {
		return _class;
	}
	public void set_class(String _class) {
		this._class = _class;
	}
	public String get_method() {
		return _method;
	}
	public void set_method(String _method) {
		this._method = _method;
	}
	public ArrayList<Type> get_arguments() {
		return _arguments;
	}
	public void set_arguments(ArrayList<Type> _arguments) {
		this._arguments = _arguments;
	}
	public Type get_return() {
		return _return;
	}
	public void set_return(Type _return) {
		this._return = _return;
	}
	private Type _return;		

}
