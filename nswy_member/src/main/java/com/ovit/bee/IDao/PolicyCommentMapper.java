package com.ovit.bee.IDao;

import java.util.List;
import com.ovit.bee.pojo.PolicyComment;

public interface PolicyCommentMapper {
   
    void insert(PolicyComment record);
  
    PolicyComment selectByPrimaryKey(Integer id);
    
    List<PolicyComment> findPolicyComment(PolicyComment record);
    
    List<PolicyComment> findPolicyCommentId(PolicyComment record);
    
    List<PolicyComment> findMyComment(PolicyComment record);
    
    
    void updateThumbUpNum(PolicyComment record);
}