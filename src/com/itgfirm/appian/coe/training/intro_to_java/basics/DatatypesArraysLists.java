package com.itgfirm.appian.coe.training.intro_to_java.basics;

import java.util.Arrays;
import java.util.Collection;
import org.apache.log4j.Logger;

public class DatatypesArraysLists {
	public static final String COMPLETED = "Completed Processing";
	private static final Logger LOG = Logger.getLogger(DatatypesArraysLists.class);

	// Primitives
	private boolean primBoolean = true;
	private byte primByte = 127; // 8-bit length: -128 to 127
	private short primShort = 32767; // 16-bit length: -32768 to 32767
	private int primInteger = 12345; // 32-bit length: -2^31 to 2^31-1
	private long primLong = 1234567890L; // 64-bit length: -2^63 to 2^63-1
	private double primDouble = 2.2; // Double-precision 64-bit floating point, good for currency
	private float primFloat = 1.1F; // Single-precision 32-bit floating point, good for memory
	private char primChar = '\u0000'; // 16-bit Unicode \u0000 (0) to \uffff (65535)

	// Number and String objects
	private Boolean objBoolean = new Boolean(primBoolean);
	private Byte objByte = new Byte(primByte);
	private Short objShort = new Short(primShort);
	private Character objChar = new Character(primChar);
	private String objString = "This is a string!!";
	private Number objNumber = new Number() {
		private static final long serialVersionUID = -8843226766008742712L;
		private Long objLong = new Long(primLong);
		private Integer objInteger = new Integer(primInteger);
		private Float objFloat = new Float(primFloat);
		private Double objDouble = new Double(primDouble);

		@Override
		public long longValue() {
			return objLong.longValue();
		}

		@Override
		public int intValue() {
			return objInteger.intValue();
		}

		@Override
		public float floatValue() {
			return objFloat.floatValue();
		}

		@Override
		public double doubleValue() {
			return objDouble.doubleValue();
		}
	};

	// Arrays
	private Object[] arrObject = { objBoolean, objByte, objChar, new Double(objNumber.doubleValue()),
			new Float(objNumber.floatValue()), new Integer(objNumber.intValue()), new Long(objNumber.longValue()),
			objShort, objString };

	// Collections
	private Collection<?> colList = Arrays.asList(arrObject);

	public DatatypesArraysLists() {
		colList.forEach(o -> {
			LOG.info("The base class of this object is " + o.getClass().getSimpleName() + " | Its value is "
					+ o.toString());
		});
		this.objString = COMPLETED;
	}

	public final boolean isPrimBoolean() {
		return primBoolean;
	}

	public final void setPrimBoolean(boolean primBoolean) {
		this.primBoolean = primBoolean;
	}

	public final byte getPrimByte() {
		return primByte;
	}

	public final void setPrimByte(byte primByte) {
		this.primByte = primByte;
	}

	public final short getPrimShort() {
		return primShort;
	}

	public final void setPrimShort(short primShort) {
		this.primShort = primShort;
	}

	public final int getPrimInteger() {
		return primInteger;
	}

	public final void setPrimInteger(int primInteger) {
		this.primInteger = primInteger;
	}

	public final long getPrimLong() {
		return primLong;
	}

	public final void setPrimLong(long primLong) {
		this.primLong = primLong;
	}

	public final double getPrimDouble() {
		return primDouble;
	}

	public final void setPrimDouble(double primDouble) {
		this.primDouble = primDouble;
	}

	public final float getPrimFloat() {
		return primFloat;
	}

	public final void setPrimFloat(float primFloat) {
		this.primFloat = primFloat;
	}

	public final char getPrimChar() {
		return primChar;
	}

	public final void setPrimChar(char primChar) {
		this.primChar = primChar;
	}

	public final Boolean getObjBoolean() {
		return objBoolean;
	}

	public final void setObjBoolean(Boolean objBoolean) {
		this.objBoolean = objBoolean;
	}

	public final Byte getObjByte() {
		return objByte;
	}

	public final void setObjByte(Byte objByte) {
		this.objByte = objByte;
	}

	public final Short getObjShort() {
		return objShort;
	}

	public final void setObjShort(Short objShort) {
		this.objShort = objShort;
	}

	public final Character getObjChar() {
		return objChar;
	}

	public final void setObjChar(Character objChar) {
		this.objChar = objChar;
	}

	public final String getObjString() {
		return objString;
	}

	public final void setObjString(String objString) {
		this.objString = objString;
	}

	public final Number getObjNumber() {
		return objNumber;
	}

	public final void setObjNumber(Number objNumber) {
		this.objNumber = objNumber;
	}

	public final Object[] getArrObject() {
		return arrObject;
	}

	public final void setArrObject(Object[] arrObject) {
		this.arrObject = arrObject;
	}

	public final Collection<?> getColList() {
		return colList;
	}

	public final void setColList(Collection<?> colList) {
		this.colList = colList;
	}
}
