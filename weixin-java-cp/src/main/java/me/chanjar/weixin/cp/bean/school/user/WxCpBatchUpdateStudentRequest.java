package me.chanjar.weixin.cp.bean.school.user;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import lombok.experimental.Accessors;
import me.chanjar.weixin.cp.util.json.WxCpGsonBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * 批量更新学生请求.
 *
 * @author Wang_Wong
 * created on  2022-07-01
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class WxCpBatchUpdateStudentRequest implements Serializable {
  private static final long serialVersionUID = -4960239393895754138L;

  @SerializedName("students")
  private List<Student> students;

  @Setter
  @Getter
  public static class Student implements Serializable {

    @SerializedName("student_userid")
    private String studentUserId;

    @SerializedName("new_student_userid")
    private String newStudentUserId;

    @SerializedName("name")
    private String name;

    @SerializedName("department")
    private List<Integer> department;

    public static Student fromJson(String json) {
      return WxCpGsonBuilder.create().fromJson(json, Student.class);
    }

    public String toJson() {
      return WxCpGsonBuilder.create().toJson(this);
    }

  }

  public static WxCpBatchUpdateStudentRequest fromJson(String json) {
    return WxCpGsonBuilder.create().fromJson(json, WxCpBatchUpdateStudentRequest.class);
  }

  public String toJson() {
    return WxCpGsonBuilder.create().toJson(this);
  }

}
