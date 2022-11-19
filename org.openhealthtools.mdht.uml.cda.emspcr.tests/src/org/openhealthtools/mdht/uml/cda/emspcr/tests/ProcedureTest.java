/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.Procedure;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedureOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureAbandonedProcedureRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Abandoned Procedure Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedurePriorRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Prior Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureNumberOfAttemptsRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureSuccessfulRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Successful Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureComplicationsRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedurePatientResponseRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Patient Response Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedurePerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureAirwayConfirmationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Airway Confirmation Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureReasonProcedureNotAttemptedRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Reason Procedure Not Attempted Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureDeviceParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Device Participation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureTest extends CDAValidationTest {

	/**
*
* @generated
*/
@Test



public void testValidateProcedureAbandonedProcedureRelationship() {
			OperationsTestCase<Procedure> validateProcedureAbandonedProcedureRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureAbandonedProcedureRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureAbandonedProcedureRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAbandonedProcedureRelationshipTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedurePriorRelationship() {
			OperationsTestCase<Procedure> validateProcedurePriorRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateProcedurePriorRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedurePriorRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePriorRelationshipTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedureNumberOfAttemptsRelationship() {
			OperationsTestCase<Procedure> validateProcedureNumberOfAttemptsRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureNumberOfAttemptsRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureNumberOfAttemptsRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNumberOfAttemptsRelationshipTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedureSuccessfulRelationship() {
			OperationsTestCase<Procedure> validateProcedureSuccessfulRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureSuccessfulRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureSuccessfulRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureSuccessfulRelationshipTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedureComplicationsRelationship() {
			OperationsTestCase<Procedure> validateProcedureComplicationsRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureComplicationsRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureComplicationsRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureComplicationsRelationshipTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedurePatientResponseRelationship() {
			OperationsTestCase<Procedure> validateProcedurePatientResponseRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateProcedurePatientResponseRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedurePatientResponseRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePatientResponseRelationshipTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedurePerformer() {
			OperationsTestCase<Procedure> validateProcedurePerformerTestCase = new OperationsTestCase<Procedure>(
			"validateProcedurePerformer",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedurePerformer(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePerformerTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedureAirwayConfirmationRelationship() {
			OperationsTestCase<Procedure> validateProcedureAirwayConfirmationRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureAirwayConfirmationRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureAirwayConfirmationRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAirwayConfirmationRelationshipTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedureReasonProcedureNotAttemptedRelationship() {
			OperationsTestCase<Procedure> validateProcedureReasonProcedureNotAttemptedRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureReasonProcedureNotAttemptedRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_REASON_PROCEDURE_NOT_ATTEMPTED_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureReasonProcedureNotAttemptedRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureReasonProcedureNotAttemptedRelationshipTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedureTemplateId() {
			OperationsTestCase<Procedure> validateProcedureTemplateIdTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureTemplateId(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureTemplateIdTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedureCode() {
			OperationsTestCase<Procedure> validateProcedureCodeTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureCode(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedureCodeP() {
			OperationsTestCase<Procedure> validateProcedureCodePTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureCodeP(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureCodePTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedureNegationInd() {
			OperationsTestCase<Procedure> validateProcedureNegationIndTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureNegationInd(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNegationIndTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedureStatusCode() {
			OperationsTestCase<Procedure> validateProcedureStatusCodeTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
			
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureStatusCode(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureStatusCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedureEffectiveTime() {
			OperationsTestCase<Procedure> validateProcedureEffectiveTimeTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureEffectiveTime(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEffectiveTimeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedureApproachSiteCode() {
			OperationsTestCase<Procedure> validateProcedureApproachSiteCodeTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureApproachSiteCode(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureApproachSiteCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedureApproachSiteCodeP() {
			OperationsTestCase<Procedure> validateProcedureApproachSiteCodePTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureApproachSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureApproachSiteCodeP(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureApproachSiteCodePTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateProcedureDeviceParticipation() {
			OperationsTestCase<Procedure> validateProcedureDeviceParticipationTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureDeviceParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_DEVICE_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureOperations.validateProcedureDeviceParticipation(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureDeviceParticipationTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<Procedure> {
		@Override
		public Procedure create() {
			return EmspcrFactory.eINSTANCE.createProcedure();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends ProcedureOperations {
	}

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
	        @SuppressWarnings("unused")
			ConstructorTestClass constructorTestClass = new ConstructorTestClass();		
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {		
		return null;
	}

} // ProcedureOperations
