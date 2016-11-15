package com.ecommerce.domain;

/**
 * 
 * @author aml
 *
 */
public enum Taille {

	/**
	 * SMALL.
	 * 
	 */
	S{
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "S";
		}
	},
	/**
	 * Medium.
	 */
	M{
		
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "M";
		}
	},

	/**
	 * Large.
	 */

	L{
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "L";
		}
		
	},

	/**
	 * X Large.
	 */
	XL{
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "XL";
		}
	}
	
	
	

}
