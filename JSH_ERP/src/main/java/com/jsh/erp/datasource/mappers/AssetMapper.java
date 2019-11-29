package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.Asset;
import com.jsh.erp.datasource.entities.AssetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_asset
     *
     * @mbggenerated
     */
    int countByExample(AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_asset
     *
     * @mbggenerated
     */
    int deleteByExample(AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_asset
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_asset
     *
     * @mbggenerated
     */
    int insert(Asset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_asset
     *
     * @mbggenerated
     */
    int insertSelective(Asset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_asset
     *
     * @mbggenerated
     */
    List<Asset> selectByExampleWithBLOBs(AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_asset
     *
     * @mbggenerated
     */
    List<Asset> selectByExample(AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_asset
     *
     * @mbggenerated
     */
    Asset selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_asset
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Asset record, @Param("example") AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_asset
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Asset record, @Param("example") AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_asset
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Asset record, @Param("example") AssetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_asset
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Asset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_asset
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Asset record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_asset
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Asset record);
}