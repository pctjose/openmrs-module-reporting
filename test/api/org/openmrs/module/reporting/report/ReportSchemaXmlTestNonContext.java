/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.reporting.report;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the small class ReportDefinitionXml without database accesses
 */
public class ReportSchemaXmlTestNonContext {
	
	/**
	 * Test the updateFromAttributes method
	 * 
	 * @throws Exception
	 */
	@Test
	public void shouldUpdateFromAttributes() throws Exception {
		StringBuilder xml = new StringBuilder();
		xml.append("<reportDefinition id=\"1\">\n");
		xml.append("    <name>PEPFAR report</name>\n");
		xml.append("	<description>\n");
		xml.append("		Sample monthly PEPFAR report, modeled after the lesotho one\n");
		xml.append("	</description>\n");
		xml.append("	<parameters class=\"java.util.ArrayList\">\n");
		xml
		        .append("		<parameter type=\"java.util.Date\"><name>report.startDate</name><label>When does the report period start?</label></parameter>/>\n");
		xml
		        .append("		<parameter type=\"java.util.Date\"><name>report.endDate</name><label>When does the report period end?</label></parameter>\n");
		xml
		        .append("		<parameter type=\"org.openmrs.Location\"><name>report.location</name><label>For which clinic is this report?</label></parameter>\n");
		xml.append("	</parameters>\n");
		xml.append("	<dataSets class=\"java.util.ArrayList\">\n");
		xml.append("		<dataSetDefinition class=\"org.openmrs.dataset.CohortDataSetDefinition\" name=\"Cohorts\">\n");
		xml.append("			<strategies class=\"java.util.LinkedHashMap\">\n");
		xml.append("				<entry>\n");
		xml.append("					<string>1.a</string>\n");
		xml.append("					<cohort class=\"org.openmrs.report.PatientSearch\">\n");
		xml.append("						<specification>[Male]</specification>\n");
		xml.append("					</cohort>\n");
		xml.append("				</entry>\n");
		xml.append("				<entry>\n");
		xml.append("					<string>1.b</string>\n");
		xml.append("					<cohort class=\"org.openmrs.report.PatientSearch\">\n");
		xml.append("						<specification>[Male] and [Adult] and [EnrolledOnDate|untilDate=${report.startDate - 1d}]</specification>\n");
		xml.append("					</cohort>\n");
		xml.append("				</entry>\n");
		xml.append("			</strategies>\n");
		xml.append("		</dataSetDefinition>\n");
		xml.append("	</dataSets>\n");
		xml.append("</reportDefinition>\n");
		
		
		// FIXME 
		// TODO These tests should be in separate methods
		Assert.fail("ReportDefinitionXml has been removed and does not have a suitable replacement");

		// create and check the report schema object
		//ReportDefinitionXml reportDefinitionXml = new ReportDefinitionXml();
		//reportDefinitionXml.setXml(xml.toString());
		//reportDefinitionXml.setReportDefinitionId(1);		
		//reportDefinitionXml.updateXmlFromAttributes();
		
		String newXml = "";
		
		//String newXml = reportDefinitionXml.getXml();
		assertTrue("The id in the xml should be set from the reportDefinitionXml object", newXml.contains(" reportDefinitionId=\"1\" "));
		
		// now test with reportDefinitionId already set
		xml = new StringBuilder();
		xml.append("<reportDefinition id=\"1\" reportDefinitionId=\"123\">\n");
		xml.append("    <name>PEPFAR report</name>\n");
		xml.append("	<description>\n");
		xml.append("		Sample monthly PEPFAR report, modeled after the lesotho one\n");
		xml.append("	</description>\n");
		xml.append("	<parameters class=\"java.util.ArrayList\">\n");
		xml
		        .append("		<parameter type=\"java.util.Date\"><name>report.startDate</name><label>When does the report period start?</label></parameter>/>\n");
		xml
		        .append("		<parameter type=\"java.util.Date\"><name>report.endDate</name><label>When does the report period end?</label></parameter>\n");
		xml
		        .append("		<parameter type=\"org.openmrs.Location\"><name>report.location</name><label>For which clinic is this report?</label></parameter>\n");
		xml.append("	</parameters>\n");
		xml.append("	<dataSets class=\"java.util.ArrayList\">\n");
		xml.append("		<dataSetDefinition class=\"org.openmrs.dataset.CohortDataSetDefinition\" name=\"Cohorts\">\n");
		xml.append("			<strategies class=\"java.util.LinkedHashMap\">\n");
		xml.append("				<entry>\n");
		xml.append("					<string>1.a</string>\n");
		xml.append("					<cohort class=\"org.openmrs.report.PatientSearch\">\n");
		xml.append("						<specification>[Male]</specification>\n");
		xml.append("					</cohort>\n");
		xml.append("				</entry>\n");
		xml.append("				<entry>\n");
		xml.append("					<string>1.b</string>\n");
		xml.append("					<cohort class=\"org.openmrs.report.PatientSearch\">\n");
		xml
		        .append("						<specification>[Male] and [Adult] and [EnrolledOnDate|untilDate=${report.startDate - 1d}]</specification>\n");
		xml.append("					</cohort>\n");
		xml.append("				</entry>\n");
		xml.append("			</strategies>\n");
		xml.append("		</dataSetDefinition>\n");
		xml.append("	</dataSets>\n");
		xml.append("</reportDefinition>\n");
		
		
		// FIXME 
		// TODO These tests should be in separate methods
		Assert.fail("ReportDefinitionXml has been removed and does not have a suitable replacement");
		
		// create and check the report schema object
		//reportDefinitionXml = new ReportDefinitionXml();
		//reportDefinitionXml.setXml(xml.toString());
		//reportDefinitionXml.setReportDefinitionId(12);
		//reportDefinitionXml.updateXmlFromAttributes();
		//newXml = reportDefinitionXml.getXml();
		assertTrue("The id in the xml should be set from the reportDefinitionXml object", newXml
		        .contains(" reportDefinitionId=\"12\">"));
		
		xml = new StringBuilder();
		xml.append("<reportDefinition id=\"1\" reportDefinitionId=\'1\'>\n");
		xml.append("    <name>PEPFAR report</name>\n");
		xml.append("	<description>\n");
		xml.append("		Sample monthly PEPFAR report, modeled after the lesotho one\n");
		xml.append("	</description>\n");
		xml.append("	<parameters class=\"java.util.ArrayList\">\n");
		xml
		        .append("		<parameter type=\"java.util.Date\"><name>report.startDate</name><label>When does the report period start?</label></parameter>/>\n");
		xml
		        .append("		<parameter type=\"java.util.Date\"><name>report.endDate</name><label>When does the report period end?</label></parameter>\n");
		xml
		        .append("		<parameter type=\"org.openmrs.Location\"><name>report.location</name><label>For which clinic is this report?</label></parameter>\n");
		xml.append("	</parameters>\n");
		xml.append("	<dataSets class=\"java.util.ArrayList\">\n");
		xml.append("		<dataSetDefinition class=\"org.openmrs.dataset.CohortDataSetDefinition\" name=\"Cohorts\">\n");
		xml.append("			<strategies class=\"java.util.LinkedHashMap\">\n");
		xml.append("				<entry>\n");
		xml.append("					<string>1.a</string>\n");
		xml.append("					<cohort class=\"org.openmrs.report.PatientSearch\">\n");
		xml.append("						<specification>[Male]</specification>\n");
		xml.append("					</cohort>\n");
		xml.append("				</entry>\n");
		xml.append("				<entry>\n");
		xml.append("					<string>1.b</string>\n");
		xml.append("					<cohort class=\"org.openmrs.report.PatientSearch\">\n");
		xml
		        .append("						<specification>[Male] and [Adult] and [EnrolledOnDate|untilDate=${report.startDate - 1d}]</specification>\n");
		xml.append("					</cohort>\n");
		xml.append("				</entry>\n");
		xml.append("			</strategies>\n");
		xml.append("		</dataSetDefinition>\n");
		xml.append("	</dataSets>\n");
		xml.append("</reportDefinition>\n");
		
		
		
		// FIXME 
		// TODO These tests should be in separate methods
		Assert.fail("ReportDefinitionXml has been removed and does not have a suitable replacement");
		
		// create and check the report schema object
		//reportDefinitionXml = new ReportDefinitionXml();
		//reportDefinitionXml.setXml(xml.toString());
		//reportDefinitionXml.setReportDefinitionId(1234);		
		//reportDefinitionXml.updateXmlFromAttributes();		
		//newXml = reportDefinitionXml.getXml();
		assertTrue("The id in the xml should be set from the reportDefinitionXml object", newXml
		        .contains(" reportDefinitionId=\"1234\">"));
		
		xml = new StringBuilder();
		xml.append("<reportDefinition reportDefinitionId=\'1\' id=\"1\">\n");
		xml.append("    <name>PEPFAR report</name>\n");
		xml.append("	<description>\n");
		xml.append("		Sample monthly PEPFAR report, modeled after the lesotho one\n");
		xml.append("	</description>\n");
		xml.append("	<parameters class=\"java.util.ArrayList\">\n");
		xml
		        .append("		<parameter type=\"java.util.Date\"><name>report.startDate</name><label>When does the report period start?</label></parameter>/>\n");
		xml
		        .append("		<parameter type=\"java.util.Date\"><name>report.endDate</name><label>When does the report period end?</label></parameter>\n");
		xml
		        .append("		<parameter type=\"org.openmrs.Location\"><name>report.location</name><label>For which clinic is this report?</label></parameter>\n");
		xml.append("	</parameters>\n");
		xml.append("	<dataSets class=\"java.util.ArrayList\">\n");
		xml.append("		<dataSetDefinition class=\"org.openmrs.dataset.CohortDataSetDefinition\" name=\"Cohorts\">\n");
		xml.append("			<strategies class=\"java.util.LinkedHashMap\">\n");
		xml.append("				<entry>\n");
		xml.append("					<string>1.a</string>\n");
		xml.append("					<cohort class=\"org.openmrs.report.PatientSearch\">\n");
		xml.append("						<specification>[Male]</specification>\n");
		xml.append("					</cohort>\n");
		xml.append("				</entry>\n");
		xml.append("				<entry>\n");
		xml.append("					<string>1.b</string>\n");
		xml.append("					<cohort class=\"org.openmrs.report.PatientSearch\">\n");
		xml
		        .append("						<specification>[Male] and [Adult] and [EnrolledOnDate|untilDate=${report.startDate - 1d}]</specification>\n");
		xml.append("					</cohort>\n");
		xml.append("				</entry>\n");
		xml.append("			</strategies>\n");
		xml.append("		</dataSetDefinition>\n");
		xml.append("	</dataSets>\n");
		xml.append("</reportDefinition>\n");
		
		
		
		// FIXME 
		// TODO These tests should be in separate methods
		Assert.fail("ReportDefinitionXml has been removed and does not have a suitable replacement");

		// create and check the report schema object
		//reportDefinitionXml = new ReportDefinitionXml();
		//reportDefinitionXml.setXml(xml.toString());
		//reportDefinitionXml.setReportDefinitionId(1234);		
		//reportDefinitionXml.updateXmlFromAttributes();		
		//newXml = reportDefinitionXml.getXml();
		assertTrue("The id in the xml should be set from the reportDefinitionXml object", newXml
		        .contains(" reportDefinitionId=\"1234\" "));
	}
	
}