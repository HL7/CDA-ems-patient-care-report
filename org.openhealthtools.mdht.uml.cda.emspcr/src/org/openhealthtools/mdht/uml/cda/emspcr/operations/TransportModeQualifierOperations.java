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
import org.openhealthtools.mdht.uml.cda.emspcr.TransportModeQualifier;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Transport Mode Qualifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeQualifier#validateTransportModeQualifierTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeQualifier#validateTransportModeQualifierClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeQualifier#validateTransportModeQualifierCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeQualifier#validateTransportModeQualifierCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeQualifier#validateTransportModeQualifierMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeQualifier#validateTransportModeQualifierValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeQualifier#validateTransportModeQualifierValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransportModeQualifierOperations extends ClinicalStatementOperations {

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
	protected TransportModeQualifierOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransportModeQualifierTemplateId(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransportModeQualifierTemplateId(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSPORT_MODE_QUALIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.193' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateTransportModeQualifierTemplateId(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransportModeQualifierTemplateId(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TRANSPORT_MODE_QUALIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transportModeQualifier The receiving '<em><b>Transport Mode Qualifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransportModeQualifierTemplateId(TransportModeQualifier transportModeQualifier,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TransportModeQualifierTransportModeQualifierTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_TRANSPORT_MODE_QUALIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRANSPORT_MODE_QUALIFIER);
			try {
				VALIDATE_TRANSPORT_MODE_QUALIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRANSPORT_MODE_QUALIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRANSPORT_MODE_QUALIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(transportModeQualifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRANSPORT_MODE_QUALIFIER__TRANSPORT_MODE_QUALIFIER_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("TransportModeQualifierTransportModeQualifierTemplateId"),
						 new Object [] { transportModeQualifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransportModeQualifierClassCode(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransportModeQualifierClassCode(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSPORT_MODE_QUALIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateTransportModeQualifierClassCode(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransportModeQualifierClassCode(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TRANSPORT_MODE_QUALIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transportModeQualifier The receiving '<em><b>Transport Mode Qualifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransportModeQualifierClassCode(TransportModeQualifier transportModeQualifier,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TransportModeQualifierTransportModeQualifierClassCode","ERROR");
    
  	  
  	  
		if (VALIDATE_TRANSPORT_MODE_QUALIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRANSPORT_MODE_QUALIFIER);
			try {
				VALIDATE_TRANSPORT_MODE_QUALIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRANSPORT_MODE_QUALIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRANSPORT_MODE_QUALIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(transportModeQualifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRANSPORT_MODE_QUALIFIER__TRANSPORT_MODE_QUALIFIER_CLASS_CODE,
						 EmspcrPlugin.INSTANCE.getString("TransportModeQualifierTransportModeQualifierClassCode"),
						 new Object [] { transportModeQualifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransportModeQualifierCodeP(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransportModeQualifierCodeP(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSPORT_MODE_QUALIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTransportModeQualifierCodeP(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransportModeQualifierCodeP(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TRANSPORT_MODE_QUALIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transportModeQualifier The receiving '<em><b>Transport Mode Qualifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransportModeQualifierCodeP(TransportModeQualifier transportModeQualifier,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TransportModeQualifierTransportModeQualifierCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_TRANSPORT_MODE_QUALIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRANSPORT_MODE_QUALIFIER);
			try {
				VALIDATE_TRANSPORT_MODE_QUALIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRANSPORT_MODE_QUALIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRANSPORT_MODE_QUALIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(transportModeQualifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRANSPORT_MODE_QUALIFIER__TRANSPORT_MODE_QUALIFIER_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("TransportModeQualifierTransportModeQualifierCodeP"),
						 new Object [] { transportModeQualifier }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.TransportModeQualifierCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.TransportModeQualifierCodeP", passToken);
				}
				passToken.add(transportModeQualifier);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransportModeQualifierCode(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransportModeQualifierCode(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSPORT_MODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '77153-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateTransportModeQualifierCode(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransportModeQualifierCode(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TRANSPORT_MODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transportModeQualifier The receiving '<em><b>Transport Mode Qualifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransportModeQualifierCode(TransportModeQualifier transportModeQualifier,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.TransportModeQualifierCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(transportModeQualifier)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TransportModeQualifierTransportModeQualifierCode","ERROR");
    
  	  
  	  
		if (VALIDATE_TRANSPORT_MODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRANSPORT_MODE_QUALIFIER);
			try {
				VALIDATE_TRANSPORT_MODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRANSPORT_MODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRANSPORT_MODE_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(transportModeQualifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRANSPORT_MODE_QUALIFIER__TRANSPORT_MODE_QUALIFIER_CODE,
						 EmspcrPlugin.INSTANCE.getString("TransportModeQualifierTransportModeQualifierCode"),
						 new Object [] { transportModeQualifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransportModeQualifierMoodCode(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransportModeQualifierMoodCode(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSPORT_MODE_QUALIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateTransportModeQualifierMoodCode(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransportModeQualifierMoodCode(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TRANSPORT_MODE_QUALIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transportModeQualifier The receiving '<em><b>Transport Mode Qualifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransportModeQualifierMoodCode(TransportModeQualifier transportModeQualifier,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TransportModeQualifierTransportModeQualifierMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_TRANSPORT_MODE_QUALIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRANSPORT_MODE_QUALIFIER);
			try {
				VALIDATE_TRANSPORT_MODE_QUALIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRANSPORT_MODE_QUALIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRANSPORT_MODE_QUALIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(transportModeQualifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRANSPORT_MODE_QUALIFIER__TRANSPORT_MODE_QUALIFIER_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("TransportModeQualifierTransportModeQualifierMoodCode"),
						 new Object [] { transportModeQualifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransportModeQualifierValue(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransportModeQualifierValue(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSPORT_MODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA22798-5' or value.code = 'LA22799-3' or value.code = 'LA22800-9' or value.code = 'LA22801-7' or value.code = 'LA22802-5' or value.code = 'LA22803-3' or value.code = 'LA22804-1' or value.code = 'LA22805-8' or value.code = 'LA22807-4' or value.code = 'LA22806-6')))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransportModeQualifierValue(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransportModeQualifierValue(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TRANSPORT_MODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transportModeQualifier The receiving '<em><b>Transport Mode Qualifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransportModeQualifierValue(TransportModeQualifier transportModeQualifier,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TransportModeQualifierTransportModeQualifierValue","ERROR");
    
  	  
  	  
		if (VALIDATE_TRANSPORT_MODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRANSPORT_MODE_QUALIFIER);
			try {
				VALIDATE_TRANSPORT_MODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRANSPORT_MODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRANSPORT_MODE_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(transportModeQualifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRANSPORT_MODE_QUALIFIER__TRANSPORT_MODE_QUALIFIER_VALUE,
						 EmspcrPlugin.INSTANCE.getString("TransportModeQualifierTransportModeQualifierValue"),
						 new Object [] { transportModeQualifier }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransportModeQualifierValueP(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransportModeQualifierValueP(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSPORT_MODE_QUALIFIER_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (( not self.value->isEmpty())  and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransportModeQualifierValueP(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Qualifier Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransportModeQualifierValueP(TransportModeQualifier, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_TRANSPORT_MODE_QUALIFIER_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transportModeQualifier The receiving '<em><b>Transport Mode Qualifier</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransportModeQualifierValueP(TransportModeQualifier transportModeQualifier,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"TransportModeQualifierTransportModeQualifierValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_TRANSPORT_MODE_QUALIFIER_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.TRANSPORT_MODE_QUALIFIER);
			try {
				VALIDATE_TRANSPORT_MODE_QUALIFIER_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_TRANSPORT_MODE_QUALIFIER_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_TRANSPORT_MODE_QUALIFIER_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(transportModeQualifier)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.TRANSPORT_MODE_QUALIFIER__TRANSPORT_MODE_QUALIFIER_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("TransportModeQualifierTransportModeQualifierValueP"),
						 new Object [] { transportModeQualifier }));
			}
			 
			return false;
		}
		return true;
	}

} // TransportModeQualifierOperations
