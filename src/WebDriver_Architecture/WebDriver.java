package WebDriver_Architecture;

public interface WebDriver extends SearchContext {
	@Override
	public void findElement();
	@Override
	public void findElements();

	 public void get(String url);
	 
	 public void Launch(String Browser);
	 
	 public String getText(String ele);
	 
	 public void sendkeys(String Username,String password);
	 
	 public boolean isDispalyed();
	 
	 public void click();
	 
	 

}
