<?xml version="1.0" encoding="UTF-8" ?>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Document</title>
    <style>
        @page{
            size: A4;
            width: 50em;
            margin-left: 1cm;
            margin-right: 1cm;

        }
        body{font-family:"Albany WT SC";color: #000000;line-height:1.4;font-size:10px;position: relative;}
        img{
            width:6cm;
        }
        .container{
            margin: 0 auto;
            /* margin-left: 120px;
            margin-right: 120px; */

        }
        .login h2{
            text-align: center;
        }
        .key{
            width:3.7cm;
        }
        table{
            width: 100%;
            border-collapse:collapse;

        }
        tr {
            height: 40px;
        }
        /* td{
         border:1px solid #eee
        } */
    </style>
       
</head>
<body>
<div class="container">
    <table >
        <tr>
            <td colspan="2" style="border-bottom:1px solid black;"> <img src="${imageBasePath}/logo.jpg" alt=""/></td>
            <!-- <td colspan="2" style="border-bottom:1px solid black;"></td> -->
            <td colspan="4" style="border-bottom:1px solid black;vertical-align: bottom; font-size: 12px;text-align: right;">债券注册发行表 </td>
        </tr>
        <tr style="height:0.4cm" >
            <td colspan="6"></td>
        </tr>
        <tr>

            <td colspan="6" style="font-size: 24px;font-weight: 700; text-align: center;">债券注册发行表</td>

        </tr>
        <tr style="height:0.2cm" >
            <td colspan="6"></td>
        </tr>
        <tr style="height:0.2cm">

            <td class="key" style="font-size: 22px;font-weight: 700;">注册信息:</td>
            <td  colspan="2" style="border-bottom:1px solid black;"></td>
            <td colspan="3"  style="border-bottom:1px solid black;"></td>
        </tr>
        <tr>
            <td class="key">产品名称:</td>
            <td colspan="2">${data.contractName! ''}</td>
            <td class="key">业务单元:</td>
            <td colspan="2">${data.commercianUnit! ''}</td>
        </tr>
        <tr>
            <td class="key" >公司名称:</td>
            <td colspan="5">${data.organName! ''}</td>

        </tr>
        <tr>
            <td class="key" >项目名称:</td>
            <td colspan="5">${data.projectName! ''}</td>

        </tr>
        <tr>
            <td class="key">注册机构:</td>
            <td colspan="2">${data.registrationAgency! ''}</td>
            <td class="key">注册额度(元):</td>
            <td  colspan="2">${data.registrationQuota! ''}</td>
        </tr>
        <tr>
            <td class="key">开始日期:</td>
            <td colspan="2">${data.approvalStartDate! ''}</td>
            <td class="key">债券期限(月):</td>
            <td colspan="2">${data.bondMaturity! ''}</td>
        </tr>
        <tr>
            <td class="key">主承销商:</td>
            <td colspan="5">${data.headName! ''}</td>

        </tr>
        <tr>

            <td class="key" style="font-size: 22px;font-weight: 700;">申请信息:</td>
            <td  colspan="2" style="border-bottom:1px solid black;"></td>
            <td colspan="3"  style="border-bottom:1px solid black;"></td>
        </tr>
        <tr>
            <td class="key">申请单号:</td>
            <td colspan="2">${data.applicationNumber! ''}</td>
            <td class="key">申请人:</td>
            <td colspan="2">${data.applicant! ''}</td>
        </tr>
        <tr>
            <td class="key">申请日期:</td>
            <td colspan="2">${data.timeApplication! ''}</td>
            <td colspan="3"></td>
        </tr>
        <tr>

            <td class="key" style="font-size: 22px;font-weight: 700;">发行信息:</td>
            <td  colspan="2" style="border-bottom:1px solid black;"></td>
            <td colspan="3"  style="border-bottom:1px solid black;"></td>
        </tr>
        <#if (data.isDynamicMechanism)?? && data.isDynamicMechanism=='1'>
            <tr>
                <td class="key">发行上限金额(元):</td>
                <td colspan="2">${data.maximumAmountIssue! ''}</td>
                <td class="key">发行下限金额(元):</td>
                <td colspan="2">${data.minimumAmountIssue! ''}</td>
            </tr>
            <tr>
                <td class="key">拟发行利率上限(%):</td>
                <td colspan="2">${data.proposedInterestRateCeiling! ''}</td>
                <td class="key">拟发行利率上限(%):</td>
                <td colspan="2">${data.lowerLimitInterestRateIssued! ''}</td>
            </tr>
            <tr>
                <td class="key">债券期限:</td>
                <td colspan="2">${data.bondMaturity! ''}</td>
            </tr>
            <#else >
                <tr>
                    <td class="key">拟发行金额(元):</td>
                    <td colspan="2">${data.amountToBeIssued! ''}</td>
                    <td class="key">拟发行利率上限(%):</td>
                    <td colspan="2">${data.proposedInterestRateCeiling! ''}</td>
                </tr>
                <tr>
                    <td class="key">拟发行利率上限(%):</td>
                    <td colspan="2">${data.lowerLimitInterestRateIssued! ''}</td>
                    <td class="key">债券期限:</td>
                    <td colspan="2">${data.bondMaturity! ''}</td>
                </tr>
        </#if>

        <#if data.processOptions??>
            <#list data.processOptions as opinion>
            <tr>
                <td colspan="6" style="font-size: 18px;font-weight: 700; text-align: left;">${opinion.workitemname! ''}意见</td>
            </tr>
            <tr style="height:70px;">
                <td colspan="6" style="border: 1px solid black;">${opinion.content! ''}</td>
            </tr>
            <tr>
                <td class="key" colspan="2"></td>
                <td class="key"  style="text-align: right;">签字:</td>
                <td class="key" >${opinion.producerName! ''}</td>
                <td class="key"  style="text-align: right;">日期:</td>
                <td class="key">${opinion.createTime?string('yyyy-MM-dd HH:mm:ss')}</td>
            </tr>
            </#list>
        </#if>
        <#if data.fssBondIssueAgencyFeeInfos??>
        <tr>
            <td class="key" style="font-size: 22px;font-weight: 700;">其他中介费:</td>
            <td  colspan="2" style="border-bottom:1px solid black;"></td>
            <td colspan="3"  style="border-bottom:1px solid black;"></td>
        </tr>
        </#if>
    </table>
    <table border="1">
        <#if data.fssBondIssueAgencyFeeInfos??>
            <tr >
                <th>中介名称</th>
                <th>金额（元）</th>
                <th>备注</th>
            </tr>
            <#list data.fssBondIssueAgencyFeeInfos as info>
                <tr>
                    <td class="key" >${(info.agentName)!''}</td>
                    <td class="key" >${info.amount! ''}</td>
                    <td class="key" >${(info.agencyFeeRemark)!}</td>
                </tr>
            </#list>
        </#if>
    </table>

</div>

</body>
</html>