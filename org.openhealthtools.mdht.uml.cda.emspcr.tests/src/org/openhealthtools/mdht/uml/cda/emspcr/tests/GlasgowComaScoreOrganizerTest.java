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
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.GlasgowComaScoreOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Glasgow Coma Score Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerComponent414(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Component414</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerComponent42(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Component42</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerComponent43(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Component43</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerComponent44(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Component44</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowComaScoreOrganizer#validateGlasgowComaScoreOrganizerComponent45(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Coma Score Organizer Component45</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GlasgowComaScoreOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowComaScoreOrganizerTemplateId() {
			OperationsTestCase<GlasgowComaScoreOrganizer> validateGlasgowComaScoreOrganizerTemplateIdTestCase = new OperationsTestCase<GlasgowComaScoreOrganizer>(
			"validateGlasgowComaScoreOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(GlasgowComaScoreOrganizer target) {

			}

			@Override
			protected void updateToPass(GlasgowComaScoreOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerTemplateId(
					(GlasgowComaScoreOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowComaScoreOrganizerTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowComaScoreOrganizerEffectiveTime() {
			OperationsTestCase<GlasgowComaScoreOrganizer> validateGlasgowComaScoreOrganizerEffectiveTimeTestCase = new OperationsTestCase<GlasgowComaScoreOrganizer>(
			"validateGlasgowComaScoreOrganizerEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(GlasgowComaScoreOrganizer target) {

			}

			@Override
			protected void updateToPass(GlasgowComaScoreOrganizer target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerEffectiveTime(
					(GlasgowComaScoreOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowComaScoreOrganizerEffectiveTimeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateGlasgowComaScoreOrganizerComponent414() {
			OperationsTestCase<GlasgowComaScoreOrganizer> validateGlasgowComaScoreOrganizerComponent414TestCase = new OperationsTestCase<GlasgowComaScoreOrganizer>(
			"validateGlasgowComaScoreOrganizerComponent414",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_COMPONENT414__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(GlasgowComaScoreOrganizer target) {

			}

			@Override
			protected void updateToPass(GlasgowComaScoreOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerComponent414(
					(GlasgowComaScoreOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowComaScoreOrganizerComponent414TestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateGlasgowComaScoreOrganizerComponent42() {
			OperationsTestCase<GlasgowComaScoreOrganizer> validateGlasgowComaScoreOrganizerComponent42TestCase = new OperationsTestCase<GlasgowComaScoreOrganizer>(
			"validateGlasgowComaScoreOrganizerComponent42",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(GlasgowComaScoreOrganizer target) {

			}

			@Override
			protected void updateToPass(GlasgowComaScoreOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerComponent42(
					(GlasgowComaScoreOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowComaScoreOrganizerComponent42TestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateGlasgowComaScoreOrganizerComponent43() {
			OperationsTestCase<GlasgowComaScoreOrganizer> validateGlasgowComaScoreOrganizerComponent43TestCase = new OperationsTestCase<GlasgowComaScoreOrganizer>(
			"validateGlasgowComaScoreOrganizerComponent43",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_COMPONENT43__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(GlasgowComaScoreOrganizer target) {

			}

			@Override
			protected void updateToPass(GlasgowComaScoreOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerComponent43(
					(GlasgowComaScoreOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowComaScoreOrganizerComponent43TestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateGlasgowComaScoreOrganizerComponent44() {
			OperationsTestCase<GlasgowComaScoreOrganizer> validateGlasgowComaScoreOrganizerComponent44TestCase = new OperationsTestCase<GlasgowComaScoreOrganizer>(
			"validateGlasgowComaScoreOrganizerComponent44",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_COMPONENT44__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(GlasgowComaScoreOrganizer target) {

			}

			@Override
			protected void updateToPass(GlasgowComaScoreOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerComponent44(
					(GlasgowComaScoreOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowComaScoreOrganizerComponent44TestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test



public void testValidateGlasgowComaScoreOrganizerComponent45() {
			OperationsTestCase<GlasgowComaScoreOrganizer> validateGlasgowComaScoreOrganizerComponent45TestCase = new OperationsTestCase<GlasgowComaScoreOrganizer>(
			"validateGlasgowComaScoreOrganizerComponent45",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_COMA_SCORE_ORGANIZER_COMPONENT45__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(GlasgowComaScoreOrganizer target) {

			}

			@Override
			protected void updateToPass(GlasgowComaScoreOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return GlasgowComaScoreOrganizerOperations.validateGlasgowComaScoreOrganizerComponent45(
					(GlasgowComaScoreOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowComaScoreOrganizerComponent45TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GlasgowComaScoreOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GlasgowComaScoreOrganizer> {
		@Override
		public GlasgowComaScoreOrganizer create() {
			return EmspcrFactory.eINSTANCE.createGlasgowComaScoreOrganizer();
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
	private static class ConstructorTestClass extends GlasgowComaScoreOrganizerOperations {
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

} // GlasgowComaScoreOrganizerOperations
