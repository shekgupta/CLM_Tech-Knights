package com.bmc.innov8.cloud.bean;

import com.bmc.innov8.cloud.constants.MessageType;

public class Email implements Message{
	
MessageStatus emailStatus;

	@Override
	public int send(String text) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void recieve() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MessageType getMessageType() {
		// TODO Auto-generated method stub
		return MessageType.EMAIL;
	}

	@Override
	public MessageStatus getStatus() {
		// TODO Auto-generated method stub
		return emailStatus;
	}

	@Override
	public void setStatus(MessageStatus status) {
		this.emailStatus=status;
		
	}


	
}
