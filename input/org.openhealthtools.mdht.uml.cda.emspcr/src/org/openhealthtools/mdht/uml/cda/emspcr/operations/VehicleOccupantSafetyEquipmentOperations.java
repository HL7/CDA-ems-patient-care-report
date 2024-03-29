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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vehicle Occupant Safety Equipment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment#validateVehicleOccupantSafetyEquipmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment#validateVehicleOccupantSafetyEquipmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment#validateVehicleOccupantSafetyEquipmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment#validateVehicleOccupantSafetyEquipmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment#validateVehicleOccupantSafetyEquipmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment#validateVehicleOccupantSafetyEquipmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VehicleOccupantSafetyEquipmentOperations extends ClinicalStatementOperations {

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
	protected VehicleOccupantSafetyEquipmentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleOccupantSafetyEquipmentTemplateId(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleOccupantSafetyEquipmentTemplateId(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.56' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleOccupantSafetyEquipmentTemplateId(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleOccupantSafetyEquipmentTemplateId(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleOccupantSafetyEquipment The receiving '<em><b>Vehicle Occupant Safety Equipment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVehicleOccupantSafetyEquipmentTemplateId(
			VehicleOccupantSafetyEquipment vehicleOccupantSafetyEquipment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"VehicleOccupantSafetyEquipmentVehicleOccupantSafetyEquipmentTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT);
			try {
				VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vehicleOccupantSafetyEquipment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("VehicleOccupantSafetyEquipmentVehicleOccupantSafetyEquipmentTemplateId"),
						 new Object [] { vehicleOccupantSafetyEquipment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleOccupantSafetyEquipmentMoodCode(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleOccupantSafetyEquipmentMoodCode(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleOccupantSafetyEquipmentMoodCode(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleOccupantSafetyEquipmentMoodCode(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleOccupantSafetyEquipment The receiving '<em><b>Vehicle Occupant Safety Equipment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVehicleOccupantSafetyEquipmentMoodCode(
			VehicleOccupantSafetyEquipment vehicleOccupantSafetyEquipment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"VehicleOccupantSafetyEquipmentVehicleOccupantSafetyEquipmentMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT);
			try {
				VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vehicleOccupantSafetyEquipment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("VehicleOccupantSafetyEquipmentVehicleOccupantSafetyEquipmentMoodCode"),
						 new Object [] { vehicleOccupantSafetyEquipment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleOccupantSafetyEquipmentCodeP(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleOccupantSafetyEquipmentCodeP(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleOccupantSafetyEquipmentCodeP(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleOccupantSafetyEquipmentCodeP(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleOccupantSafetyEquipment The receiving '<em><b>Vehicle Occupant Safety Equipment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVehicleOccupantSafetyEquipmentCodeP(
			VehicleOccupantSafetyEquipment vehicleOccupantSafetyEquipment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"VehicleOccupantSafetyEquipmentVehicleOccupantSafetyEquipmentCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT);
			try {
				VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vehicleOccupantSafetyEquipment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("VehicleOccupantSafetyEquipmentVehicleOccupantSafetyEquipmentCodeP"),
						 new Object [] { vehicleOccupantSafetyEquipment }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipmentCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipmentCodeP", passToken);
				}
				passToken.add(vehicleOccupantSafetyEquipment);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleOccupantSafetyEquipmentCode(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleOccupantSafetyEquipmentCode(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67499-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleOccupantSafetyEquipmentCode(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleOccupantSafetyEquipmentCode(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleOccupantSafetyEquipment The receiving '<em><b>Vehicle Occupant Safety Equipment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVehicleOccupantSafetyEquipmentCode(
			VehicleOccupantSafetyEquipment vehicleOccupantSafetyEquipment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipmentCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(vehicleOccupantSafetyEquipment)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"VehicleOccupantSafetyEquipmentVehicleOccupantSafetyEquipmentCode","ERROR");
    
  	  
  	  
		if (VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT);
			try {
				VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vehicleOccupantSafetyEquipment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE,
						 EmspcrPlugin.INSTANCE.getString("VehicleOccupantSafetyEquipmentVehicleOccupantSafetyEquipmentCode"),
						 new Object [] { vehicleOccupantSafetyEquipment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleOccupantSafetyEquipmentValue(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleOccupantSafetyEquipmentValue(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA137-2' or value.code = 'LA17375-9' or value.code = 'LA17376-7' or value.code = 'LA17377-5' or value.code = 'LA17378-3' or value.code = 'LA17379-1' or value.code = 'LA17380-9' or value.code = 'LA17382-5' or value.code = 'LA46-8' or value.code = 'LA9381-0' or value.code = 'LA9391-9' or value.code = 'LA9392-7' or value.code = 'LA9393-5' or value.code = 'LA11137-9')))";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleOccupantSafetyEquipmentValue(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleOccupantSafetyEquipmentValue(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleOccupantSafetyEquipment The receiving '<em><b>Vehicle Occupant Safety Equipment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVehicleOccupantSafetyEquipmentValue(
			VehicleOccupantSafetyEquipment vehicleOccupantSafetyEquipment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"VehicleOccupantSafetyEquipmentVehicleOccupantSafetyEquipmentValue","ERROR");
    
  	  
  	  
		if (VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT);
			try {
				VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vehicleOccupantSafetyEquipment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE,
						 EmspcrPlugin.INSTANCE.getString("VehicleOccupantSafetyEquipmentVehicleOccupantSafetyEquipmentValue"),
						 new Object [] { vehicleOccupantSafetyEquipment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVehicleOccupantSafetyEquipmentValueP(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleOccupantSafetyEquipmentValueP(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (( not self.value->isEmpty())  and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateVehicleOccupantSafetyEquipmentValueP(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVehicleOccupantSafetyEquipmentValueP(VehicleOccupantSafetyEquipment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vehicleOccupantSafetyEquipment The receiving '<em><b>Vehicle Occupant Safety Equipment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVehicleOccupantSafetyEquipmentValueP(
			VehicleOccupantSafetyEquipment vehicleOccupantSafetyEquipment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"VehicleOccupantSafetyEquipmentVehicleOccupantSafetyEquipmentValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT);
			try {
				VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vehicleOccupantSafetyEquipment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.VEHICLE_OCCUPANT_SAFETY_EQUIPMENT__VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("VehicleOccupantSafetyEquipmentVehicleOccupantSafetyEquipmentValueP"),
						 new Object [] { vehicleOccupantSafetyEquipment }));
			}
			 
			return false;
		}
		return true;
	}

} // VehicleOccupantSafetyEquipmentOperations
