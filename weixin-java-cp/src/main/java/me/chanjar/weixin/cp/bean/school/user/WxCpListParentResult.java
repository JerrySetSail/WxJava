package me.chanjar.weixin.cp.bean.school.user;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import lombok.experimental.Accessors;
import me.chanjar.weixin.cp.bean.WxCpBaseResp;
import me.chanjar.weixin.cp.util.json.WxCpGsonBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * 获取部门家长详情返回结果.
 *
 * @author Wang_Wong
 * created on  2022-07-13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class WxCpListParentResult extends WxCpBaseResp implements Serializable {
  private static final long serialVersionUID = -4960239393895754138L;

  @SerializedName("parents")
  private List<Parent> parents;

  @Setter
  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Parent implements Serializable {

    @SerializedName("parent_userid")
    private String parentUserId;

    @SerializedName("mobile")
    private String mobile;

    @SerializedName("external_userid")
    private String externalUserId;

    @SerializedName("is_subscribe")
    private Integer isSubscribe;

    @SerializedName("children")
    private List<Children> children;

    public static Parent fromJson(String json) {
      return WxCpGsonBuilder.create().fromJson(json, Parent.class);
    }

    public String toJson() {
      return WxCpGsonBuilder.create().toJson(this);
    }

  }

  @Setter
  @Getter
  @Builder
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Children implements Serializable {

    @SerializedName("student_userid")
    private String studentUserId;

    @SerializedName("relation")
    private String relation;

    @SerializedName("name")
    private String name;

    public static Children fromJson(String json) {
      return WxCpGsonBuilder.create().fromJson(json, Children.class);
    }

    public String toJson() {
      return WxCpGsonBuilder.create().toJson(this);
    }

  }

  public static WxCpListParentResult fromJson(String json) {
    return WxCpGsonBuilder.create().fromJson(json, WxCpListParentResult.class);
  }

  public String toJson() {
    return WxCpGsonBuilder.create().toJson(this);
  }

}
