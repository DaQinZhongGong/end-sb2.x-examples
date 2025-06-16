package com.daqinzhonggong.repository.secondary;

import com.daqinzhonggong.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author daqinzhonggong
 */
public interface SecondaryRepository extends MongoRepository<User, String> {
}
