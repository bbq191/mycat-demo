package com.example.mycatdemo.model;

public class User {
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * user.id
   *
   * @mbg.generated Wed Oct 02 22:36:40 CST 2019
   */
  private Integer id;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * user.username
   *
   * @mbg.generated Wed Oct 02 22:36:40 CST 2019
   */
  private String username;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * user.province_id
   *
   * @mbg.generated Wed Oct 02 22:36:40 CST 2019
   */
  private Integer provinceId;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * user.user_id
   *
   * @mbg.generated Wed Oct 02 22:36:40 CST 2019
   */
  private Integer userId;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column user.id
   *
   * @return the value of user.id
   * @mbg.generated Wed Oct 02 22:36:40 CST 2019
   */
  public Integer getId() {
    return id;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column user.id
   *
   * @param id the value for user.id
   * @mbg.generated Wed Oct 02 22:36:40 CST 2019
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column user.username
   *
   * @return the value of user.username
   * @mbg.generated Wed Oct 02 22:36:40 CST 2019
   */
  public String getUsername() {
    return username;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column user.username
   *
   * @param username the value for user.username
   * @mbg.generated Wed Oct 02 22:36:40 CST 2019
   */
  public void setUsername(String username) {
    this.username = username == null ? null : username.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column user.province_id
   *
   * @return the value of user.province_id
   * @mbg.generated Wed Oct 02 22:36:40 CST 2019
   */
  public Integer getProvinceId() {
    return provinceId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column user.province_id
   *
   * @param provinceId the value for user.province_id
   * @mbg.generated Wed Oct 02 22:36:40 CST 2019
   */
  public void setProvinceId(Integer provinceId) {
    this.provinceId = provinceId;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column user.user_id
   *
   * @return the value of user.user_id
   * @mbg.generated Wed Oct 02 22:36:40 CST 2019
   */
  public Integer getUserId() {
    return userId;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column user.user_id
   *
   * @param userId the value for user.user_id
   * @mbg.generated Wed Oct 02 22:36:40 CST 2019
   */
  public void setUserId(Integer userId) {
    this.userId = userId;
  }
}
