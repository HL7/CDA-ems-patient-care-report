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
import org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Height Of Fall</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall#validateHeightOfFallTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall#validateHeightOfFallMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall#validateHeightOfFallCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall#validateHeightOfFallCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFall#validateHeightOfFallValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeightOfFallOperations extends ClinicalStatementOperations {

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
	protected HeightOfFallOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHeightOfFallTemplateId(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeightOfFallTemplateId(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEIGHT_OF_FALL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.58' and id.extension = '2022-01-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateHeightOfFallTemplateId(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeightOfFallTemplateId(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_HEIGHT_OF_FALL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param heightOfFall The receiving '<em><b>Height Of Fall</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHeightOfFallTemplateId(HeightOfFall heightOfFall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"HeightOfFallHeightOfFallTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_HEIGHT_OF_FALL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HEIGHT_OF_FALL);
			try {
				VALIDATE_HEIGHT_OF_FALL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEIGHT_OF_FALL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEIGHT_OF_FALL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(heightOfFall)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.HEIGHT_OF_FALL__HEIGHT_OF_FALL_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("HeightOfFallHeightOfFallTemplateId"),
						 new Object [] { heightOfFall }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHeightOfFallMoodCode(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeightOfFallMoodCode(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEIGHT_OF_FALL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateHeightOfFallMoodCode(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeightOfFallMoodCode(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_HEIGHT_OF_FALL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param heightOfFall The receiving '<em><b>Height Of Fall</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHeightOfFallMoodCode(HeightOfFall heightOfFall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"HeightOfFallHeightOfFallMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_HEIGHT_OF_FALL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HEIGHT_OF_FALL);
			try {
				VALIDATE_HEIGHT_OF_FALL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEIGHT_OF_FALL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEIGHT_OF_FALL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(heightOfFall)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.HEIGHT_OF_FALL__HEIGHT_OF_FALL_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("HeightOfFallHeightOfFallMoodCode"),
						 new Object [] { heightOfFall }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHeightOfFallCodeP(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeightOfFallCodeP(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEIGHT_OF_FALL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHeightOfFallCodeP(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeightOfFallCodeP(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_HEIGHT_OF_FALL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param heightOfFall The receiving '<em><b>Height Of Fall</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHeightOfFallCodeP(HeightOfFall heightOfFall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"HeightOfFallHeightOfFallCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_HEIGHT_OF_FALL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HEIGHT_OF_FALL);
			try {
				VALIDATE_HEIGHT_OF_FALL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEIGHT_OF_FALL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEIGHT_OF_FALL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(heightOfFall)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.HEIGHT_OF_FALL__HEIGHT_OF_FALL_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("HeightOfFallHeightOfFallCodeP"),
						 new Object [] { heightOfFall }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFallCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFallCodeP", passToken);
				}
				passToken.add(heightOfFall);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHeightOfFallCode(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeightOfFallCode(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEIGHT_OF_FALL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67501-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHeightOfFallCode(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeightOfFallCode(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_HEIGHT_OF_FALL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param heightOfFall The receiving '<em><b>Height Of Fall</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHeightOfFallCode(HeightOfFall heightOfFall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.HeightOfFallCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(heightOfFall)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"HeightOfFallHeightOfFallCode","ERROR");
    
  	  
  	  
		if (VALIDATE_HEIGHT_OF_FALL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HEIGHT_OF_FALL);
			try {
				VALIDATE_HEIGHT_OF_FALL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEIGHT_OF_FALL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEIGHT_OF_FALL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(heightOfFall)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.HEIGHT_OF_FALL__HEIGHT_OF_FALL_CODE,
						 EmspcrPlugin.INSTANCE.getString("HeightOfFallHeightOfFallCode"),
						 new Object [] { heightOfFall }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHeightOfFallValue(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeightOfFallValue(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEIGHT_OF_FALL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHeightOfFallValue(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Of Fall Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHeightOfFallValue(HeightOfFall, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_HEIGHT_OF_FALL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param heightOfFall The receiving '<em><b>Height Of Fall</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHeightOfFallValue(HeightOfFall heightOfFall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"HeightOfFallHeightOfFallValue","ERROR");
    
  	  
  	  
		if (VALIDATE_HEIGHT_OF_FALL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.HEIGHT_OF_FALL);
			try {
				VALIDATE_HEIGHT_OF_FALL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEIGHT_OF_FALL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEIGHT_OF_FALL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(heightOfFall)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.HEIGHT_OF_FALL__HEIGHT_OF_FALL_VALUE,
						 EmspcrPlugin.INSTANCE.getString("HeightOfFallHeightOfFallValue"),
						 new Object [] { heightOfFall }));
			}
			 
			return false;
		}
		return true;
	}

} // HeightOfFallOperations
