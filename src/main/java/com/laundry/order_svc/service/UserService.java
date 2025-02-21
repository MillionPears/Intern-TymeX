package com.laundry.order_svc.service;

import com.laundry.order_svc.dto.UserCreateRequest;
import com.laundry.order_svc.dto.UserResponse;
import com.laundry.order_svc.dto.UserUpdateRequest;
import com.laundry.order_svc.enums.Gender;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;


public interface UserService {
  UserResponse createUser(  UserCreateRequest userCreateRequest);

  UserResponse getUserByUserId(UUID userId);

  //List<UserResponse> getAllUsers();
  UserResponse updateUser(UUID userId, UserUpdateRequest userUpdateRequest);

  List<UserResponse> searchUserByName(String name, Pageable pageable);

  List<UserResponse> filterUserByGender(Gender gender, Pageable pageable);

  Page<UserResponse> searchAndFilterNotIndex(String name, Gender gender, String sortBy, String sortDirection, Pageable pageable);

  Page<UserResponse> searchAndFilterWithIndex(String name, Gender gender, String sortBy, String sortDirection, Pageable pageable);
}
