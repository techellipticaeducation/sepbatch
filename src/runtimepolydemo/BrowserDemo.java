package runtimepolydemo;

public class BrowserDemo {
	public static void main(String[] args) {
		WebBrowser chrome = new ChromeBrowser();
		chrome.openLink();
		chrome.closeLink();
		
	}
}
// Overriding is optional - parent method - logic
// mandate


class WebBrowser{
	public void openLink() {
		
	}
	
	public void closeLink() {

	}
}


class ChromeBrowser extends WebBrowser{
	public void openLink() {
		System.out.println("chrome - > open link");	
	}
	public void closeLink() {
		System.out.println("chrome - > close link");	
	}
	public void chormeMethod() {
		System.out.println("");
	}
}

class MozillaBrowser extends WebBrowser{
	public void openLink() {
		System.out.println("mozilla - > open link");	
	}
	public void closeLink() {
		System.out.println("mozilla - > close link");	
	}
}

class EdgeBrowser extends WebBrowser{
	public void openLink() {
		System.out.println("edge - > open link");	
	}
	public void closeLink() {
		System.out.println("edge - > close link");	
	}
}