package org.openhab.binding.simplebinary.internal;

/**
 * 
 * Class holding item data
 * 
 * @author vita
 * @since 1.8.0
 */
public class SimpleBinaryItemData extends SimpleBinaryMessage {

	protected byte[] itemData;

	/**
	 * Construct item data instance for unspecified item
	 * 
	 * @param messageId Message ID
	 * @param deviceId  Device ID
	 * @param itemData  Raw data
	 */
	public SimpleBinaryItemData(byte messageId, int deviceId, byte[] itemData) {
		super(messageId, deviceId, -1);

		this.itemData = itemData;
	}
	
	/**
	 * Construct item data instance
	 * 
	 * @param messageId   Message ID
	 * @param deviceId    Device ID
	 * @param itemAddress Item address
	 * @param itemData    Raw data
	 */
	public SimpleBinaryItemData(byte messageId, int deviceId, int itemAddress, byte[] itemData) {
		super(messageId, deviceId, itemAddress);

		this.itemData = itemData;
	}

	/**
	 * Return item raw data
	 * 
	 * @return
	 */
	public byte[] getData() {
		return itemData;
	}

}
