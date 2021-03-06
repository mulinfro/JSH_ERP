package com.jsh.model.po;

import java.sql.Timestamp;

@SuppressWarnings("serial")
public class DepotHead implements java.io.Serializable
{
	private Long Id;
	private String Type;
	private String SubType;
	private Depot ProjectId;
	private String Number;
	private String OperPersonName;	
	private Timestamp CreateTime;	
	private Timestamp OperTime;	
	private Supplier OrganId;
	private Person HandsPersonId;
	private Person WareHousePersonId;
	private String SettlementWay;	
	private Building BuildingId;
	private Depot AllocationProjectId;	
	private String Remark;
	private String State;
	private String ReAuditPersonName;
	private String Reason;
	

	public DepotHead()
	{
		
	}

	public DepotHead(Long Id)
	{
		this.Id = Id ;
	}

	public DepotHead(String type, String subType, Depot projectId,
			String number, String operPersonName, Timestamp createTime,
			Timestamp operTime, Supplier organId, Person handsPersonId,
			Person wareHousePersonId, String settlementWay,
			Building buildingId, Depot allocationProjectId, String remark,
			String state, String reAuditPersonName, String reason) {
		super();
		Type = type;
		SubType = subType;
		ProjectId = projectId;
		Number = number;
		OperPersonName = operPersonName;
		CreateTime = createTime;
		OperTime = operTime;
		OrganId = organId;
		HandsPersonId = handsPersonId;
		WareHousePersonId = wareHousePersonId;
		SettlementWay = settlementWay;
		BuildingId = buildingId;
		AllocationProjectId = allocationProjectId;
		Remark = remark;
		State = state;
		ReAuditPersonName = reAuditPersonName;
		Reason = reason;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getSubType() {
		return SubType;
	}

	public void setSubType(String subType) {
		SubType = subType;
	}

	public Depot getProjectId() {
		return ProjectId;
	}

	public void setProjectId(Depot projectId) {
		ProjectId = projectId;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public String getOperPersonName() {
		return OperPersonName;
	}

	public void setOperPersonName(String operPersonName) {
		OperPersonName = operPersonName;
	}

	public Timestamp getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(Timestamp createTime) {
		CreateTime = createTime;
	}

	public Timestamp getOperTime() {
		return OperTime;
	}

	public void setOperTime(Timestamp operTime) {
		OperTime = operTime;
	}

	public Supplier getOrganId() {
		return OrganId;
	}

	public void setOrganId(Supplier organId) {
		OrganId = organId;
	}

	public Person getHandsPersonId() {
		return HandsPersonId;
	}

	public void setHandsPersonId(Person handsPersonId) {
		HandsPersonId = handsPersonId;
	}

	public Person getWareHousePersonId() {
		return WareHousePersonId;
	}

	public void setWareHousePersonId(Person wareHousePersonId) {
		WareHousePersonId = wareHousePersonId;
	}

	public String getSettlementWay() {
		return SettlementWay;
	}

	public void setSettlementWay(String settlementWay) {
		SettlementWay = settlementWay;
	}

	public Building getBuildingId() {
		return BuildingId;
	}

	public void setBuildingId(Building buildingId) {
		BuildingId = buildingId;
	}

	public Depot getAllocationProjectId() {
		return AllocationProjectId;
	}

	public void setAllocationProjectId(Depot allocationProjectId) {
		AllocationProjectId = allocationProjectId;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getReAuditPersonName() {
		return ReAuditPersonName;
	}

	public void setReAuditPersonName(String reAuditPersonName) {
		ReAuditPersonName = reAuditPersonName;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}
	
	

}