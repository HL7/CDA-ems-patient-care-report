/**
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.OrganizerOperations;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Additional Vital Signs Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent416(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component416</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent42(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component42</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent43(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component43</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent44(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component44</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent45(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component45</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent46(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component46</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent47(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component47</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer#validateAdditionalVitalSignsOrganizerComponent48(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component48</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditionalVitalSignsOrganizerOperations extends OrganizerOperations {

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
	protected AdditionalVitalSignsOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerTemplateId(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerTemplateId(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.30' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerTemplateId(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerTemplateId(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerTemplateId(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerTemplateId"),
						 new Object [] { additionalVitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerMoodCode(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerMoodCode(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerMoodCode(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerMoodCode(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerMoodCode(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerMoodCode"),
						 new Object [] { additionalVitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerEffectiveTime(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerEffectiveTime(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerEffectiveTime(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerEffectiveTime(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerEffectiveTime(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerEffectiveTime","INFO");
    
  	  
  	  
		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerEffectiveTime"),
						 new Object [] { additionalVitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerComponent416(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component416</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent416(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT416__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerComponent416(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component416</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent416(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT416__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdditionalVitalSignsOrganizerComponent416(AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent416","INFO");
    
  	  
  	  
		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT416__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT416__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT416__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT416__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT416,
						 EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent416"),
						 new Object [] { additionalVitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerComponent42(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component42</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent42(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerComponent42(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component42</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent42(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAdditionalVitalSignsOrganizerComponent42(
			AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent42","INFO");
    
  	  
  	  
		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT42__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT42,
						 EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent42"),
						 new Object [] { additionalVitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerComponent43(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component43</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent43(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT43__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerComponent43(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component43</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent43(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT43__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdditionalVitalSignsOrganizerComponent43(AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent43","ERROR");
    
  	  
  	  
		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT43__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT43__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT43__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT43__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT43,
						 EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent43"),
						 new Object [] { additionalVitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerComponent44(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component44</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent44(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT44__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerComponent44(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component44</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent44(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT44__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdditionalVitalSignsOrganizerComponent44(AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent44","ERROR");
    
  	  
  	  
		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT44__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT44__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT44__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT44__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT44,
						 EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent44"),
						 new Object [] { additionalVitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerComponent45(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component45</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent45(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT45__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerComponent45(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component45</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent45(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT45__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdditionalVitalSignsOrganizerComponent45(AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent45","INFO");
    
  	  
  	  
		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT45__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT45__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT45__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT45__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT45,
						 EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent45"),
						 new Object [] { additionalVitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerComponent46(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component46</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent46(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT46__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerComponent46(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component46</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent46(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT46__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdditionalVitalSignsOrganizerComponent46(AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent46","ERROR");
    
  	  
  	  
		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT46__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT46__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT46__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT46__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT46,
						 EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent46"),
						 new Object [] { additionalVitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerComponent47(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component47</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent47(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT47__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerComponent47(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component47</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent47(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT47__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdditionalVitalSignsOrganizerComponent47(AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent47","WARNING");
    
  	  
  	  
		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT47__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT47__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT47__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT47__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT47,
						 EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent47"),
						 new Object [] { additionalVitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdditionalVitalSignsOrganizerComponent48(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component48</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent48(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT48__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(cda::Component4))";

	/**
	 * The cached OCL invariant for the '{@link #validateAdditionalVitalSignsOrganizerComponent48(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Additional Vital Signs Organizer Component48</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdditionalVitalSignsOrganizerComponent48(AdditionalVitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT48__DIAGNOSTIC_CHAIN_MAP__EOCL_INV=new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param additionalVitalSignsOrganizer The receiving '<em><b>Additional Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAdditionalVitalSignsOrganizerComponent48(AdditionalVitalSignsOrganizer additionalVitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent48","ERROR");
    
  	  
  	  
		if (VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT48__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.ADDITIONAL_VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT48__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT48__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT48__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(additionalVitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.ADDITIONAL_VITAL_SIGNS_ORGANIZER__ADDITIONAL_VITAL_SIGNS_ORGANIZER_COMPONENT48,
						 EmspcrPlugin.INSTANCE.getString("AdditionalVitalSignsOrganizerAdditionalVitalSignsOrganizerComponent48"),
						 new Object [] { additionalVitalSignsOrganizer }));
			}
			 
			return false;
		}
		return true;
	}

} // AdditionalVitalSignsOrganizerOperations
