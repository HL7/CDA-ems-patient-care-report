/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapability;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Destination Hospital Capability</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapability#validateDestinationHospitalCapabilityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapability#validateDestinationHospitalCapabilityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapability#validateDestinationHospitalCapabilityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapability#validateDestinationHospitalCapabilityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapability#validateDestinationHospitalCapabilityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapability#validateDestinationHospitalCapabilityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapability#validateDestinationHospitalCapabilityValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DestinationHospitalCapabilityOperations extends ClinicalStatementOperations {

	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationHospitalCapabilityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationHospitalCapabilityTemplateId(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationHospitalCapabilityTemplateId(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.104' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationHospitalCapabilityTemplateId(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationHospitalCapabilityTemplateId(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationHospitalCapability The receiving '<em><b>Destination Hospital Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDestinationHospitalCapabilityTemplateId(
			DestinationHospitalCapability destinationHospitalCapability, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DestinationHospitalCapabilityDestinationHospitalCapabilityTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_HOSPITAL_CAPABILITY);
			try {
				VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(destinationHospitalCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DESTINATION_HOSPITAL_CAPABILITY__DESTINATION_HOSPITAL_CAPABILITY_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("DestinationHospitalCapabilityDestinationHospitalCapabilityTemplateId"),
						 new Object [] { destinationHospitalCapability }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationHospitalCapabilityClassCode(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationHospitalCapabilityClassCode(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationHospitalCapabilityClassCode(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationHospitalCapabilityClassCode(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationHospitalCapability The receiving '<em><b>Destination Hospital Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDestinationHospitalCapabilityClassCode(
			DestinationHospitalCapability destinationHospitalCapability, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DestinationHospitalCapabilityDestinationHospitalCapabilityClassCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_HOSPITAL_CAPABILITY);
			try {
				VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(destinationHospitalCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DESTINATION_HOSPITAL_CAPABILITY__DESTINATION_HOSPITAL_CAPABILITY_CLASS_CODE,
						 EmspcrPlugin.INSTANCE.getString("DestinationHospitalCapabilityDestinationHospitalCapabilityClassCode"),
						 new Object [] { destinationHospitalCapability }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationHospitalCapabilityCodeP(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationHospitalCapabilityCodeP(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationHospitalCapabilityCodeP(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationHospitalCapabilityCodeP(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationHospitalCapability The receiving '<em><b>Destination Hospital Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDestinationHospitalCapabilityCodeP(
			DestinationHospitalCapability destinationHospitalCapability, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DestinationHospitalCapabilityDestinationHospitalCapabilityCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_HOSPITAL_CAPABILITY);
			try {
				VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(destinationHospitalCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DESTINATION_HOSPITAL_CAPABILITY__DESTINATION_HOSPITAL_CAPABILITY_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("DestinationHospitalCapabilityDestinationHospitalCapabilityCodeP"),
						 new Object [] { destinationHospitalCapability }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapabilityCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapabilityCodeP", passToken);
				}
				passToken.add(destinationHospitalCapability);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationHospitalCapabilityCode(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationHospitalCapabilityCode(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '77155-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationHospitalCapabilityCode(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationHospitalCapabilityCode(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationHospitalCapability The receiving '<em><b>Destination Hospital Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDestinationHospitalCapabilityCode(
			DestinationHospitalCapability destinationHospitalCapability, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.DestinationHospitalCapabilityCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(destinationHospitalCapability)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DestinationHospitalCapabilityDestinationHospitalCapabilityCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_HOSPITAL_CAPABILITY);
			try {
				VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(destinationHospitalCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DESTINATION_HOSPITAL_CAPABILITY__DESTINATION_HOSPITAL_CAPABILITY_CODE,
						 EmspcrPlugin.INSTANCE.getString("DestinationHospitalCapabilityDestinationHospitalCapabilityCode"),
						 new Object [] { destinationHospitalCapability }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationHospitalCapabilityMoodCode(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationHospitalCapabilityMoodCode(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationHospitalCapabilityMoodCode(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationHospitalCapabilityMoodCode(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationHospitalCapability The receiving '<em><b>Destination Hospital Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDestinationHospitalCapabilityMoodCode(
			DestinationHospitalCapability destinationHospitalCapability, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DestinationHospitalCapabilityDestinationHospitalCapabilityMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_HOSPITAL_CAPABILITY);
			try {
				VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(destinationHospitalCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DESTINATION_HOSPITAL_CAPABILITY__DESTINATION_HOSPITAL_CAPABILITY_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("DestinationHospitalCapabilityDestinationHospitalCapabilityMoodCode"),
						 new Object [] { destinationHospitalCapability }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationHospitalCapabilityValue(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationHospitalCapabilityValue(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA22833-0' or value.code = 'LA22834-8' or value.code = 'LA22835-5' or value.code = 'LA22836-3' or value.code = 'LA22837-1' or value.code = 'LA22838-9' or value.code = 'LA22842-1' or value.code = 'LA22843-9' or value.code = 'LA22844-7' or value.code = 'LA22845-4' or value.code = 'LA22846-2' or value.code = 'LA22847-0' or value.code = 'LA22848-8' or value.code = 'LA22849-6' or value.code = 'LA22850-4' or value.code = 'LA32931-0' or value.code = 'LA32934-4' or value.code = 'LA32935-1' or value.code = 'LA32936-9' or value.code = 'LA32933-6' or value.code = 'LA20786-2')))";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationHospitalCapabilityValue(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationHospitalCapabilityValue(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationHospitalCapability The receiving '<em><b>Destination Hospital Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDestinationHospitalCapabilityValue(
			DestinationHospitalCapability destinationHospitalCapability, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DestinationHospitalCapabilityDestinationHospitalCapabilityValue","ERROR");
    
  	  
  	  
		if (VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_HOSPITAL_CAPABILITY);
			try {
				VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(destinationHospitalCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DESTINATION_HOSPITAL_CAPABILITY__DESTINATION_HOSPITAL_CAPABILITY_VALUE,
						 EmspcrPlugin.INSTANCE.getString("DestinationHospitalCapabilityDestinationHospitalCapabilityValue"),
						 new Object [] { destinationHospitalCapability }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDestinationHospitalCapabilityValueP(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationHospitalCapabilityValueP(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (( not self.value->isEmpty())  and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDestinationHospitalCapabilityValueP(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Destination Hospital Capability Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDestinationHospitalCapabilityValueP(DestinationHospitalCapability, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param destinationHospitalCapability The receiving '<em><b>Destination Hospital Capability</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDestinationHospitalCapabilityValueP(
			DestinationHospitalCapability destinationHospitalCapability, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DestinationHospitalCapabilityDestinationHospitalCapabilityValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DESTINATION_HOSPITAL_CAPABILITY);
			try {
				VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DESTINATION_HOSPITAL_CAPABILITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(destinationHospitalCapability)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.DESTINATION_HOSPITAL_CAPABILITY__DESTINATION_HOSPITAL_CAPABILITY_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("DestinationHospitalCapabilityDestinationHospitalCapabilityValueP"),
						 new Object [] { destinationHospitalCapability }));
			}
			 
			return false;
		}
		return true;
	}

} // DestinationHospitalCapabilityOperations
