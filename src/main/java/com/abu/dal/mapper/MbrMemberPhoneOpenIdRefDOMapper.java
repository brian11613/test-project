package com.abu.dal.mapper;

import com.abu.dal.entity.MbrMemberPhoneOpenIdRefDO;
import com.abu.dal.entity.MbrMemberPhoneOpenIdRefDOExample;
import com.abu.dal.entity.MbrMemberPhoneOpenIdRefDOKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MbrMemberPhoneOpenIdRefDOMapper {
    /**
     *  根据指定的条件获取数据库记录数:mbr_member_phone_open_id_ref
     *
     * @param example
     */
    long countByExample(MbrMemberPhoneOpenIdRefDOExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录:mbr_member_phone_open_id_ref
     *
     * @param example
     */
    int deleteByExample(MbrMemberPhoneOpenIdRefDOExample example);

    /**
     *  根据主键删除数据库的记录:mbr_member_phone_open_id_ref
     *
     * @param key
     */
    int deleteByPrimaryKey(MbrMemberPhoneOpenIdRefDOKey key);

    /**
     *  动态字段,写入数据库记录:mbr_member_phone_open_id_ref
     *
     * @param record
     */
    int insertSelective(MbrMemberPhoneOpenIdRefDO record);

    /**
     *  根据指定的条件查询符合条件的数据库记录:mbr_member_phone_open_id_ref
     *
     * @param example
     */
    List<MbrMemberPhoneOpenIdRefDO> selectByExample(MbrMemberPhoneOpenIdRefDOExample example);

    /**
     *  根据指定主键获取一条数据库记录:mbr_member_phone_open_id_ref
     *
     * @param key
     */
    MbrMemberPhoneOpenIdRefDO selectByPrimaryKey(MbrMemberPhoneOpenIdRefDOKey key);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录:mbr_member_phone_open_id_ref
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") MbrMemberPhoneOpenIdRefDO record, @Param("example") MbrMemberPhoneOpenIdRefDOExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录:mbr_member_phone_open_id_ref
     *
     * @param record
     */
    int updateByPrimaryKeySelective(MbrMemberPhoneOpenIdRefDO record);
}