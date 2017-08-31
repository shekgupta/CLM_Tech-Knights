package com.bmc.innov8.cloud.bean;

import com.bmc.innov8.cloud.constants.MessageType;

public interface Message {

	int send(String text);
	void recieve();
	MessageType getMessageType();
	MessageStatus getStatus();
	void setStatus(MessageStatus status);
}
