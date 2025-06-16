
package com.daqinzhonggong.repository;

import com.daqinzhonggong.model.Message;

public interface MessageRepository {

	Iterable<Message> findAll();

	Message save(Message message);

	Message findMessage(Long id);

	void deleteMessage(Long id);

}
