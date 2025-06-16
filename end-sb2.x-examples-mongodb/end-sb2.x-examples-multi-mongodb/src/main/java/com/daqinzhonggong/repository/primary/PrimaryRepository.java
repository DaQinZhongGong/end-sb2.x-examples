package com.daqinzhonggong.repository.primary;

import com.daqinzhonggong.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author daqinzhonggong
 */
public interface PrimaryRepository extends MongoRepository<User, String> {
}
