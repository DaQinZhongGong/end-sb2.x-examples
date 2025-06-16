package com.daqinzhonggong.service;

import com.daqinzhonggong.model.Customer;

import java.util.List;

public interface CustomersInterface {

    public List<Customer> searchCity(Integer pageNumber, Integer pageSize, String searchContent);


}
