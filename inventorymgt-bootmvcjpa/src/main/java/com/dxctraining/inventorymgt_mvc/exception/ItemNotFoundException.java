package com.dxctraining.inventorymgt_mvc.exception;

public class ItemNotFoundException extends RuntimeException{

		public ItemNotFoundException(String msg) {
			super(msg);
		}
}
