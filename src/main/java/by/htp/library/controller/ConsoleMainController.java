package by.htp.library.controller;

import by.htp.library.action.BaseAction;
import by.htp.library.action.util.ActionManager;

public class ConsoleMainController {
	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		
		BaseAction action = ActionManager.defineAction(1);
	//	action.doSmth(System.out.);
	}

}
