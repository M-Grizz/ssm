package com.github.hustedleo.model;

public class Token {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_token.id
     *
     * @mbggenerated Sat Aug 13 16:56:06 CST 2016
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_token.token
     *
     * @mbggenerated Sat Aug 13 16:56:06 CST 2016
     */
    private String token;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_token.id
     *
     * @return the value of t_token.id
     *
     * @mbggenerated Sat Aug 13 16:56:06 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_token.id
     *
     * @param id the value for t_token.id
     *
     * @mbggenerated Sat Aug 13 16:56:06 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_token.token
     *
     * @return the value of t_token.token
     *
     * @mbggenerated Sat Aug 13 16:56:06 CST 2016
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_token.token
     *
     * @param token the value for t_token.token
     *
     * @mbggenerated Sat Aug 13 16:56:06 CST 2016
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }
}